package com.academy.proyecto.Controller;

import com.academy.proyecto.Models.MembersBean;
import com.mongodb.bulk.BulkWriteResult;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.BulkOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MembersBatchController {

    @Value("${file.input}")
    private String fileInput;

    @Autowired
    private MongoTemplate mongoTemplate;

    //Handles HTTP GET requests to the "/insert" endpoint.
    //Initiates a bulk update to MongoDB by reading data from a CSV file.
    //Returns a confirmation message upon successful data insertion.

    @GetMapping("/insert")
    public String directHomePage() {
        try {
            commitBulkUpdateToMongoDB();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Data inserted!";
    }


    // This method commits a bulk update to MongoDB using the Spring Data MongoDB library. 
    //The data is read from a CSV file, converted to a list of  MembersBean objects, and then fed into the BulkOperations interface. 

    private void commitBulkUpdateToMongoDB() {
        //Read data from a CSV file
        try {
        	BufferedReader reader = new BufferedReader(new FileReader(fileInput));
        	CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        	CSVReader csvReader = new CSVReaderBuilder(reader).withCSVParser(parser).withSkipLines(1).build();
            
            //Convert data to a list of MembersBean objects
            List<String[]> allData = csvReader.readAll();
            int count = 0;
            MembersBean memberData = null;
            List<MembersBean> memberInfoList = new ArrayList<>();

            //Insert data into MongoDB
            for (String[] memberRow : allData) {
                String[] memberStringArray = new String[memberRow.length];
                memberData = new MembersBean();
                count = 0;
                for (String memberInfo : memberRow) {
                    memberStringArray[count] = memberInfo;
                    count++;
                }
                memberData.setMemberId(memberStringArray[0]);
                memberData.setFullName(memberStringArray[1]);
                memberData.setEmail(memberStringArray[2]);
                memberData.setSubscriptionTier(memberStringArray[3]);
                memberData.setCost(memberStringArray[4]);
                memberInfoList.add(memberData);
            }

            //Commit data to MongoDB
            BulkOperations bulkOps = 
            		mongoTemplate.bulkOps(BulkOperations.BulkMode.UNORDERED, MembersBean.class);
            memberInfoList.stream().filter(member -> member != null).forEach(member -> {
                org.bson.Document dbDoc = new org.bson.Document().append("$set", member);
                mongoTemplate.getConverter().write(member, dbDoc);
                Query query = new Query().addCriteria(new Criteria("uuid").is(member.getMemberId()));
                Update update = Update.fromDocument(dbDoc, "");
                bulkOps.upsert(query, update);
            });

            BulkWriteResult result = bulkOps.execute();

            //Print confirmation message or error message
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
