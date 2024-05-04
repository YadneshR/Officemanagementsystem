package com.Officemngmt.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Officemngmt.springbootcrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Integer> { 
	

	Employee findByName(String name);

}
