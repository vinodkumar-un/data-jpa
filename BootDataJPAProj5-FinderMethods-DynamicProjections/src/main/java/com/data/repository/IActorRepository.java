package com.data.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.data.entity.Actor;
import com.data.view.View;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	
	public <T extends View> Iterable<T> findByCategoryContainingIgnoreCase(String letters, Class<T> clazz);
	

}
