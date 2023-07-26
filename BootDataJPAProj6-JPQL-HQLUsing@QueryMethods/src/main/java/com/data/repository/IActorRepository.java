package com.data.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.data.entity.Actor;

@Transactional
public interface IActorRepository extends JpaRepository<Actor, Integer> {
	
	//@Query("from com.data.entity.Actor a where a.category=?1")
	//@Query("select a from com.data.entity.Actor a where a.category=?1")
	//@Query("select a from com.data.entity.Actor a where a.category=:role")
	@Query("select a from com.data.entity.Actor a where a.category=:role")
	public Iterable<Actor> searchActorsByCategory(String role);
	
	@Query("select aid, aname, category, mobileNo from Actor where mobileNo=:no")
	public Object getActorByMobileNo(@Param("no") long mobileNo);
	
	@Query(value="select ACTOR_ID, ACTOR_NAME, CATEGORY, MOBILE_NO, STATUS from DATA_JPA_ACTOR", nativeQuery = true)
	public List<Actor> getActors();
	
	@Query("select max(mobileNo) from Actor")
	public float getmaxMobileNo();
	
	@Query("select min(mobileNo) from Actor")
	public float getminMobileNo();
	
	@Query("update Actor set mobileNo=:newMobileNo where aid=:id")
	@Modifying
	public int updateActorMobileNoByAid(long newMobileNo, int id);
	
	@Query("delete from Actor where category=:role")
	@Modifying
	public int deleteActorsByCategory(String role);

}
