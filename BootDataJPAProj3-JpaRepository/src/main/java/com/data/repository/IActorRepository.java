package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	
	

}
