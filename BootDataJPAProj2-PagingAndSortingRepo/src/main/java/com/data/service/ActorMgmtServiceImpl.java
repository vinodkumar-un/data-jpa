package com.data.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.data.entity.Actor;
import com.data.repository.IActorRepository;

@Service("actorService")
public class ActorMgmtServiceImpl implements IActorMgmtService {

	@Autowired
	private IActorRepository actorRepo;

	@Override
	public Iterable<Actor> showActorsByOrder(boolean asc, String... props) {
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC, props);
		Iterable<Actor> iterable = actorRepo.findAll(sort);
		return iterable;
	}
	
	@Override
	public Page<Actor> showPageRecords(int pageNo, int pageSize) {
		Page<Actor> page = actorRepo.findAll(PageRequest.of(1, 3, Sort.by(Direction.ASC, "mobileNo")));
		
		return page;
	}
	
	@Override
	public void showActorsByPage(int pagesize) {
		
	}
}
