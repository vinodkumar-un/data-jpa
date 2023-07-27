package com.data.service;

import java.util.List;

import com.data.document.Employee;

public interface IEmployeeMgmtService {
	
	
	public String saveEmployee(Employee e);
	
	public List<Employee> getAllEmployees();

}
