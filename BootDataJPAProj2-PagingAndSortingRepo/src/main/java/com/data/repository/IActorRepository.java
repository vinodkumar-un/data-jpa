package com.data.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.data.entity.Actor;

public interface IActorRepository extends PagingAndSortingRepository<Actor, Integer> {

	

}
