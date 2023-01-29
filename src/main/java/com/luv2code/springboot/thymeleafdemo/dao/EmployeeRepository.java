package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository <Employee , Integer>{
	
	//add a method to sort by lastName
	
	public List<Employee> findAllByOrderByLastNameAsc();

}
