package com.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.data.entity.Actor;
import com.data.service.IActorMgmtService;

import lombok.NonNull;

@SpringBootApplication
//@ComponentScan(basePackages = "com.data.*")
public class BootDataJpaProj1CrudRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt = SpringApplication.run(BootDataJpaProj1CrudRepositoryApplication.class, args);
		IActorMgmtService actorService = (IActorMgmtService) ctxt.getBean("actorService");
		
		List<Actor> actors = new ArrayList<>();
		
		Actor actor1 = new Actor();
		actor1.setAid(4);
		actor1.setAname("hruthik");
		actor1.setCategory("hero");
		actor1.setMobileNo(343000L);
		
		Actor actor2 = new Actor();
		actor2.setAid(5);
		actor2.setAname("ajay");
		actor2.setCategory("hero");
		actor2.setMobileNo(876000L);
		
		actors.add(actor1);
		actors.add(actor2);
		System.out.println(actorService.registerActorGroup(actors));
		//System.out.println(actorService.fetchRecordCount());
	}

}
