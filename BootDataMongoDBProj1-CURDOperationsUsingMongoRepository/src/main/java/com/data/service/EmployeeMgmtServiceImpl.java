package com.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.document.Employee;
import com.data.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeRepo empRepo;

	@Override
	public String saveEmployee(Employee e) {
		return "mongodb document saved with id value:"+empRepo.insert(e).getId();
	}
	
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return empRepo.findAll();
	}

}
