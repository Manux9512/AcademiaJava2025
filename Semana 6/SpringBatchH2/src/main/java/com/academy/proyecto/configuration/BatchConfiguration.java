package com.academy.proyecto.configuration;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.academy.proyecto.MembershipProcessor;
import com.academy.proyecto.models.MembershipBean;

@Configuration
public class BatchConfiguration {
	
	@Value("${file.input}")
    private String fileInput;


    // Creates a FlatFileItemReader bean that reads data from a delimited file specified by the 'fileInput' property. 
    // The reader is configured to parse lines into MembershipBean objects, mapping fields by name: 'memberId','fullName', 'email', 'subscriptionTier', and 'cost'
    // The reader is also configured to skip the first line of the file, which contains header information.
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public FlatFileItemReader reader() {
        return new FlatFileItemReaderBuilder<>()
            .name("itemReader")
            .resource(new ClassPathResource(fileInput))
            .delimited()
            .names(new String[] { "memberId", "fullName", "email", "subscriptionTier", "cost" })
            .fieldSetMapper(new BeanWrapperFieldSetMapper() {{
                setTargetType(MembershipBean.class);
            }})
            .linesToSkip(1)
            .build();
    }
    

    // Creates a JdbcBatchItemWriter bean that writes MembershipBean objects to a database table using JDBC.
    // The writer is configured to use a BeanPropertyItemSqlParameterSourceProvider to map fields from the MembershipBean objects to named parameters in the SQL statement.
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Bean
    public JdbcBatchItemWriter writer(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<>()
            .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
            .sql("INSERT INTO member (memberId, fullName, email, subscriptionTier, cost) VALUES (:memberId, :fullName, :email, :subscriptionTier, :cost)")
            .dataSource(dataSource)
            .build();
    }
    
    
    // Creates a Job bean that executes a Step named 'step1'. The Job is configured to use the specified JobRepository and
    // JobExecutionListener. The JobExecutionListener is used to log whether the job finished successfully or not, after the job has finished. 
    @Bean
    public Job importUserJob(JobRepository jobRepository, JobExecutionListener listener, Step step1) {
        return new JobBuilder("importUserJob", jobRepository)
            .incrementer(new RunIdIncrementer())
            .listener(jobCompletionListener())
            .flow(step1)
            .end()
            .build();
    }

    // Returns a JobExecutionListener that logs whether the job finished successfully or not, after the job has finished.
    @Bean
    public JobExecutionListener jobCompletionListener() {
        return new JobExecutionListenerSupport();
    }


    // Creates a Step that reads in a flat file of MembershipBeans using a FlatFileItemReader, processes them using a MembershipProcessor (which adds a dollar sign to the cost field), 
    // and writes them out to a database table using a JdbcBatchItemWriter.
    @Bean
    public Step step1(JobRepository jobRepository, PlatformTransactionManager transactionManager, JdbcBatchItemWriter writer) {
        return new StepBuilder("step1", jobRepository)
            .<MembershipBean, MembershipBean>chunk(5, transactionManager)
            .reader(reader())
            .processor(processor())
            .writer(writer)
            .build();
    }

    // Creates a MembershipProcessor bean that processes MembershipBean objects by adding a dollar sign to the cost field.    
    @Bean
    public MembershipProcessor processor() {
        return new MembershipProcessor();
    }



}
