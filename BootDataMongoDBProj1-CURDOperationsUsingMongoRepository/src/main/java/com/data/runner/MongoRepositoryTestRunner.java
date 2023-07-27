package com.data.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.data.document.Employee;
import com.data.service.IEmployeeMgmtService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
			Employee employee = new Employee();
			
			employee.setEmpId(1006);
			employee.setEmpName("Jason Roy");
			employee.setEmpAddr("england");
			employee.setEmpSal(4565400.0);
			employee.setVaccinated(true);
			
			//String msg = service.saveEmployee(employee);
			//System.out.println(msg);
			
			List<Employee> employees = service.getAllEmployees();
			System.out.println(employees);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
