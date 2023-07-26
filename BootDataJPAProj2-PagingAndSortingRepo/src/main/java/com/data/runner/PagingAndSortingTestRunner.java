package com.data.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.data.entity.Actor;
import com.data.service.IActorMgmtService;

@Component
public class PagingAndSortingTestRunner implements CommandLineRunner {
	
	@Autowired
	private IActorMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		// service.showActorsByOrder(false, "aid", "aname").forEach(System.out::println);;
		Page<Actor> records = service.showPageRecords(1, 3);
		System.out.println(records.getContent());
		System.out.println(records.getTotalPages());
		System.out.println(records.getTotalElements());
		
	}

}
