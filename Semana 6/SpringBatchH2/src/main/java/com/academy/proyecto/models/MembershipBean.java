package com.academy.proyecto.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MembershipBean {
	private String memberId;
	private String fullName;
	private String email;
	private String subscriptionTier;
	private String cost;
}
