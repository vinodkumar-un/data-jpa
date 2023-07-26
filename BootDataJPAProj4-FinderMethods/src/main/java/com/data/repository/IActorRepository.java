package com.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.entity.Actor;
import com.data.entity.ResultView;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	
	public List<Actor> findByAnameEquals(String name);
	
	public List<Actor> findByAnameIs(String name);
	
	public List<Actor> findByAname(String name);
	
	List<Actor> findTop5ByCategoryAndStatusTrue(String name);
	
	public List<Actor> findByMobileNoGreaterThan(long mobileno);
	
	public List<Actor> findByMobileNoBetween(long mobileno1, long mobile2);
	
	public List<Actor> findByStatusTrue();
	
	public List<Actor> findByStatusFalse();
	
	public Iterable<ResultView> findByCategoryEqualsIgnoreCase(String category);
	
	public ResultView findByMobileNo(long mobileNo);
	

}
