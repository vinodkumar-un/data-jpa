package com.data.service;

import org.springframework.data.domain.Page;

import com.data.entity.Actor;

public interface IActorMgmtService {

	public Iterable<Actor> showActorsByOrder(boolean asc, String ...props);
	public Page<Actor> showPageRecords(int pageNo, int pageSize);
	public void showActorsByPage(int pagesize);

}
