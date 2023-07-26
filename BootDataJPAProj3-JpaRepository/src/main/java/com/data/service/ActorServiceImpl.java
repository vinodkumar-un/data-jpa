package com.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.data.entity.Actor;
import com.data.repository.IActorRepository;

@Service("actorService")
public class ActorServiceImpl implements IActorService {

	@Autowired
	private IActorRepository actorRepo;

	@Override
	public String removeActorsByIdsInBatch(List<Integer> ids) {
		List<Actor> actors = actorRepo.findAllById(ids);
		int count = actors.size();
		actorRepo.deleteAllByIdInBatch(ids);
		return count + " records are deleted";
	}

	@Override
	public Actor searchActorById(int aid) {

		return actorRepo.getReferenceById(aid);
	}

	@Override
	public List<Actor> searchActorsByActor(Actor actor, boolean order, String ...props) {
		Example<Actor> example = Example.of(actor);
		Sort sort = Sort.by(order ? Direction.ASC : Direction.DESC, props);
		List<Actor> list = actorRepo.findAll(example, sort);
		
		return list;
	}

}
