package com.data.runners;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.data.repository.IActorRepository;

@Component
public class QueryMethodsTestRunner implements CommandLineRunner {

	@Autowired
	private IActorRepository actorRepo;

	@Override
	public void run(String... args) throws Exception {

		// actorRepo.searchActorsByCategory("hero").forEach(System.out::println);

		/*Object objData = actorRepo.getActorByMobileNo(766123000L);
		Object obj[] = (Object[])objData;
		for(Object ob : obj) {
			System.out.println(ob);
		}*/

		actorRepo.getActors().forEach(actor -> System.out.println(actor.getAid()+" "+actor.getAname()+" "+actor.getCategory()+" "+actor.getMobileNo()+" "+actor.isStatus()));;
		
		

		// float max = actorRepo.getmaxMobileNo();
		// System.out.println(max);

		// float min = actorRepo.getminMobileNo();
		// System.out.println(min);

		// int actorMobileNo = actorRepo.updateActorMobileNoByAid(45676554L, 44);
		// System.out.println(actorMobileNo);

		// int deleteActorsByCategory = actorRepo.deleteActorsByCategory("star star");
		// System.out.println(deleteActorsByCategory);
	}

}
