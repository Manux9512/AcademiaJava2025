package com.mongodb.mongoProject.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

//Member collection model
@Document(collection = "member")
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Member {
    @Id
    private String personId;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private Date memberSince;
    private Date renewalDate;
    private List<GymAddress> gymAddresses;
    private List<MemberGymPlan> gymPlans;
}
