package com.data.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.data.entity.ResultView;
import com.data.repository.IActorRepository;

@Component
public class FinderMethodsTestRunner implements CommandLineRunner {
	
	@Autowired
	private IActorRepository actorRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		//List<Actor> actors = actorRepo.findByAnameEquals("sushmithasen");
		// actorRepo.findByAnameIs("hayley atwell").forEach(System.out::println);;
		//actorRepo.findByAname("hayley atwell").forEach(System.out::println);;
		//actors.forEach(actor -> System.out.println(actor.toString()));
		//actorRepo.findByMobileNoGreaterThan(876000L).forEach(System.out::println);;
		//actorRepo.findByMobileNoBetween(876000L, 54393000L).forEach(System.out::println);
		//actorRepo.findByAname("ajay").forEach(System.out::println);;
		//actorRepo.findByStatusTrue().forEach(System.out::println);
		//actorRepo.findByStatusFalse().forEach(System.out::println);
		//actorRepo.findTop5ByCategoryAndStatusTrue("hero").forEach(System.out::println);;
		//actorRepo.findByCategoryEqualsIgnoreCase("heroin").forEach(view -> System.out.println(view.getAid()+" "+view.getAname()));;
		ResultView resultView = actorRepo.findByMobileNo(766123000L);
		//System.out.println(resultView.getAid()+" "+resultView.getAname());
	}

}
