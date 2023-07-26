package com.data.service;

import java.util.List;

import com.data.entity.Actor;

public interface IActorMgmtService {

	public String registerActor(Actor actor);

	public String registerActorGroup(List<Actor> actors);

	public Long fetchRecordCount();

	public List<Actor> fetchRecords();
	
	public Actor findById(int aid);
	
	public String updateActorMobileNo(int aid, long newMobileNo);
	
	public String updateActor(Actor actor);
	
	public String removeActorById(int aid);

}
