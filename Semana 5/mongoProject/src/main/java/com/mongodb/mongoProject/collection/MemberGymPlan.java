package com.mongodb.mongoProject.collection;

import lombok.Builder;
import lombok.Data;

//MemberGymPlan collection
@Data
@Builder
public class MemberGymPlan {
    private String gymPlan;
    private int cost;
}
