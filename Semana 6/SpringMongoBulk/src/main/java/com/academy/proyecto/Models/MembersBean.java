package com.academy.proyecto.Models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("members")
public class MembersBean {
	private String memberId;
	private String fullName;
	private String email;
	private String subscriptionTier;
	private String cost;
}
