package com.jdbc_practice.JDBC.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbc_practice.JDBC.entity.Customers;

public interface CustomersRepo extends JpaRepository<Customers, Integer> {

}
