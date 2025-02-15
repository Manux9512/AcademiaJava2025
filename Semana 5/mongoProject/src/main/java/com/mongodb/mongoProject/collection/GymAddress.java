package com.mongodb.mongoProject.collection;

import lombok.Builder;
import lombok.Data;

// GymAddress collection
@Data
@Builder
public class GymAddress {
    private String address1;
    private String address2;
    private String city;
}
