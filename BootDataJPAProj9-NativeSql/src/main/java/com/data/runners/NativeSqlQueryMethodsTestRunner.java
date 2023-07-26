package com.data.runners;


import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.data.entity.Actor;
import com.data.repository.IActorRepository;

@Component
public class NativeSqlQueryMethodsTestRunner implements CommandLineRunner {

	@Autowired
	private IActorRepository actorRepo;
	
	@Autowired
	private EntityManager manager;

	@Override
	public void run(String... args) throws Exception {
		
		//int count = actorRepo.insertActor("Disha Patani", "heroin", 99999998L, true);
		//System.out.println(count == 1?"Record inserted":"Record not inserted");
		
		//Date date = actorRepo.getDate();
		//System.out.println(date);
		
		//List<Actor> actors = actorRepo.getActors();
		//System.out.println(actors);
		/*
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_ACTORS_BY_CATEGORIES", Actor.class);
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Actor.class, ParameterMode.REF_CURSOR);
		query.setParameter(1, "hero");
		query.setParameter(2, "heroin");
		List<Actor> list = query.getResultList();
		list.forEach(System.out::println);*/
		Session session = manager.unwrap(Session.class);
		session.doWork(conn -> {
			
		});
	}

}
