package com.jdbc_practice.JDBC.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tabrez")
@Data
public class Customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="email_address")
	private String email;
	
	@Column(name="full_name")
	private String fullName;
	
	
	
}
//CUSTOMER_ID
//EMAIL_ADDRESS
//FULL_NAME