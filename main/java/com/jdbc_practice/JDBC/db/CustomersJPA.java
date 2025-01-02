package com.jdbc_practice.JDBC.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jdbc_practice.JDBC.entity.Customers;
import com.jdbc_practice.JDBC.repo.CustomersRepo;

@Component
public class CustomersJPA {
	
	@Autowired
	CustomersRepo cr;
	
	public List<Customers> fetchDetails(){
		return cr.findAll();
	}

	public Customers insert(Customers customer) {
		return cr.save(customer);
	}
	
	public void delete(int id) {
		cr.deleteById(id);
	}
	
	public void delete() {
		cr.deleteAll();
	}
	
	public int count() {
		return (int)cr.count();
	}
}
