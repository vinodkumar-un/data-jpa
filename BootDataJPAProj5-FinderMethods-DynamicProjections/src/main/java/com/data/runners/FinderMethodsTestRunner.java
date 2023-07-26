package com.data.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.data.entity.Actor;
import com.data.repository.IActorRepository;
import com.data.view.ResultView1;
import com.data.view.ResultView2;
import com.data.view.ResultView3;

import lombok.NonNull;

@Component
public class FinderMethodsTestRunner implements CommandLineRunner {
	
	@Autowired
	private IActorRepository actorRepo;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Iterable<ResultView1> it1 = actorRepo.findByCategoryContainingIgnoreCase("H", ResultView1.class);
		it1.forEach(view -> {
			System.out.println(view.getAid()+"   "+view.getAname());
		});
		
		
		Iterable<ResultView2> it2 = actorRepo.findByCategoryContainingIgnoreCase("H", ResultView2.class);
		it2.forEach(view -> {
			System.out.println(view.getCategory()+"   "+view.getMobileNo());
		});
		
		Iterable<ResultView3> it3 = actorRepo.findByCategoryContainingIgnoreCase("H", ResultView3.class);
		it3.forEach(view -> {
			System.out.println(view.getAid()+"  "+view.getAname()+"  "+view.getCategory());
		});
		*/
		Actor actor = new Actor("tonyjaa", "hero",433389788L);
		@NonNull
		String name = actorRepo.save(actor).getAname();
		System.out.println(name);
	}

}
