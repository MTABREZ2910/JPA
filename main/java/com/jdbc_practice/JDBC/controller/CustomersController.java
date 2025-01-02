package com.jdbc_practice.JDBC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc_practice.JDBC.entity.Customers;
import com.jdbc_practice.JDBC.service.CustomersService;

@RestController
public class CustomersController {
	
	@Autowired
	CustomersService cs;
	
	@GetMapping("/customers")
	public List<Customers> getDetails(){
		return cs.getDetails();
	}
	
	@PostMapping("/customers/insert")
	public Customers insert(@RequestBody Customers customer) {
		return cs.insert(customer);
	}
	
	@DeleteMapping("/customers/delete/{id}")
	public String delete(@PathVariable int id) {
		cs.delete(id);
		return "Row deleted";
	}
	
	@DeleteMapping("/customers/delete")
	public String delete() {
		cs.delete();
		return "Data deleted";
	}
	
	@GetMapping("/count")
	public int count() {
		return cs.count();
	}
	

}
