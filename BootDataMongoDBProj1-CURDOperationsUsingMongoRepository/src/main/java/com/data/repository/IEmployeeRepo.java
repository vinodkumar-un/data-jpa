package com.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.data.document.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee, String> {

}
