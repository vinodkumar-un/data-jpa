package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.data.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {
	
	


}
