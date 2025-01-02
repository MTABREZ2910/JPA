package com.jdbc_practice.JDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc_practice.JDBC.db.CustomersJPA;
import com.jdbc_practice.JDBC.entity.Customers;

@Service
public class CustomersService {

	@Autowired
	CustomersJPA cj;
	
	public List<Customers> getDetails(){
		return cj.fetchDetails();
	}
	
	public Customers insert(Customers customer) {
		return cj.insert(customer);
	}
	
	public void delete(int id) {
		cj.delete(id);
	}
	
	public void delete() {
		cj.delete();
	}
	
	public int count() {
		return cj.count();
	}
	
}
