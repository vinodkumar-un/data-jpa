package com.data.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.entity.Actor;
import com.data.repository.IActorRepository;

@Service("actorService")
public class ActorMgmtServiceImpl implements IActorMgmtService {

	@Autowired
	private IActorRepository actorRepo;

	@Override
	public String registerActor(Actor actor) {
		Actor actor1 = actorRepo.save(actor);
		return "actor is registered with id value " + actor1.getAid();
	}

	@Override
	public String registerActorGroup(List<Actor> actors) {
		List<Actor> actorList = null;
		Set<Integer> ids = null;
		if (actors != null) {
			actorList = (List<Actor>) actorRepo.saveAll(actors);
			ids = actorList.stream().map(Actor::getAid).collect(Collectors.toSet());
			System.out.println(ids);
		}
		return ids != null ? "actors inserted" : "actors are not inserted";
	}
	
	@Override
	public Long fetchRecordCount() {
		
		return actorRepo.count();
	}
	
	@Override
	public List<Actor> fetchRecords() {
		return (List<Actor>)actorRepo.findAll();
	}
	
	@Override
	public Actor findById(int aid) {
		return actorRepo.findById(aid).orElseThrow(() -> new IllegalArgumentException("Actor not found"));
	}
	
	@Override
	public String updateActorMobileNo(int aid, long newMobileNo) {
		Optional<Actor> opt = actorRepo.findById(aid);
		if(opt.isPresent()) {
			Actor actor = opt.get();
			actor.setMobileNo(newMobileNo);
			Actor uActor = actorRepo.save(actor);
			return uActor.getAid()+" updated successfully with mobileNo "+newMobileNo;
		}else {
			return aid+" Actor not found record for update";
		}
	}
	
	@Override
	public String updateActor(Actor actor) {
		boolean flag = actorRepo.existsById(actor.getAid());
		if(flag) {
			actorRepo.save(actor);
			return actor.getAid()+" actor information is udpated";
		}
		return actor.getAid()+" actor is not updated";
	}
	
	@Override
	public String removeActorById(int aid) {
		Optional<Actor> opt = actorRepo.findById(aid);
		if(opt.isPresent()) {
			actorRepo.deleteById(aid);
			return aid+" Actor is deleted";
		}
		return aid+" actor is not found for delettion";
	}

}
