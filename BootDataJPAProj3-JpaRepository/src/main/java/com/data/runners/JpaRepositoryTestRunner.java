package com.data.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.data.entity.Actor;
import com.data.service.IActorService;

@Component
public class JpaRepositoryTestRunner implements CommandLineRunner {
	
	@Autowired
	private IActorService service;

	@Override
	public void run(String... args) throws Exception {
		
		try {
			//System.out.println(service.removeActorsByIdsInBatch(List.of(26,  27,  28)));
			//Actor actor = service.searchActorById(33);
			//System.out.println(actor.getAid());
			//System.out.println(actor.toString());
			
			Actor actor = new Actor(30, null, null, null);
			List<Actor> actors = service.searchActorsByActor(actor, true, "aname");
			actors.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("record not found");
		}

	}

}
