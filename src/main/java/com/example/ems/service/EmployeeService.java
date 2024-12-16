package com.example.ems.service;

import java.util.List;

import com.example.ems.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(long id);
	
	public Employee createEmployee(Employee employee);
	
	public Employee updateEmployeeById(long id,Employee updatedEmployee);
	
	public void deleteEmployeeById(long id);
	
}
