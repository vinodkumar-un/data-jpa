package com.data.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Employee {

	@Id
	private String id;
	private Integer empId;
	private String empName;
	private String empAddr;
	private Double empSal;
	private boolean vaccinated;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", empName=" + empName + ", empAddr=" + empAddr + ", empSal="
				+ empSal + ", vaccinated=" + vaccinated + "]";
	}

}
