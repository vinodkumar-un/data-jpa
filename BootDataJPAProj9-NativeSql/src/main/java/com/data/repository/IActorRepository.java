package com.data.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.transaction.annotation.Transactional;

import com.data.entity.Actor;

@Transactional
public interface IActorRepository extends JpaRepository<Actor, Integer> {
	
	
	@Query(nativeQuery = true, value = "INSERT INTO DATA_JPA_ACTOR(ACTOR_ID, ACTOR_NAME, CATEGORY, MOBILE_NO, STATUS) VALUES(ACTOR_ID_SEQ.NEXTVAL, ?, ?, ?, ?)")
	@Modifying
	public int insertActor(String name, String role, long phoneNo, boolean status);
	
	@Query(nativeQuery = true, value = "SELECT SYSDATE FROM DUAL")
	public Date getDate();
	
	@Procedure(procedureName = "P_GET_ACTORS_BY_CATEGORIES")
	public List<Actor> getActors();

}
