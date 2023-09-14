package com.employeeCRUD.service;

import java.util.List;

import com.employeeCRUD.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	
	void save(Employee employee);
	
	Employee getById(Long id);
	
	void deleteByID(long id);
}
