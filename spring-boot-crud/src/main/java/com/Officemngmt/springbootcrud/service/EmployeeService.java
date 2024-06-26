package com.Officemngmt.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Officemngmt.springbootcrud.entity.Employee;
import com.Officemngmt.springbootcrud.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	
	public Employee saveEmployee (Employee employee) {
		return repository.save(employee);
		
	}
	
	public List<Employee> saveEmployees (List<Employee> employees) {
		return repository.saveAll(employees);
		
	}
	
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	
	public Employee getEmployeebyid(int id){
		return repository.findById(id).orElse(null);
	}
	
	public Employee getEmployeebyName(String name){
		return repository.findByName(name);
	}
	
	
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Employee Deleted  " + id;
	}
	
	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee= repository.findById(employee.getId()).orElse(null); 
		existingEmployee.setName(employee.getName());
		existingEmployee.setRole(employee.getRole());
		existingEmployee.setSalary(employee.getSalary());
		return repository.save(existingEmployee);
		
	}
	

}
