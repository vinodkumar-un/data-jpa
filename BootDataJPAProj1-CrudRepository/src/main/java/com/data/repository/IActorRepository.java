package com.data.repository;


import org.springframework.data.repository.CrudRepository;

import com.data.entity.Actor;

public interface IActorRepository extends CrudRepository<Actor, Integer> {

	

}
