package com.data.runner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.data.entity.Actor;
import com.data.service.IActorMgmtService;

import lombok.NonNull;

@Component
public class EmployeeConfigurationRunner implements CommandLineRunner {
	
	@Autowired
	private IActorMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		// System.out.println(service.fetchRecordCount());
		//List<Actor> records = service.fetchRecords();
		//OptionalDouble average = records.stream().map(Actor::getMobileNo).toList().stream().mapToInt(s -> s.intValue()).average();
		//Map<@NonNull String, List<Actor>> map = records.stream().sorted(Comparator.comparing(actor -> actor.getAname())).collect(Collectors.groupingBy(Actor::getAname));
		//for(Map.Entry<String, List<Actor>> entries : map.entrySet()) {
			//System.out.println(entries.getKey());
		//	System.out.println(entries.getValue());
			System.out.println("==================");
		//	List<String> collect = entries.getValue().stream().distinct().map(Actor::getAname).collect(Collectors.toList());
		//	System.out.println(collect);
		//	Actor actor = service.findById(10);
		//	System.out.println(actor);
		//String updated_mobileNo = service.updateActorMobileNo(1, 897665555L);
		//System.out.println(updated_mobileNo);
		
		//Actor actor = new Actor(2, "hayley atwell", "heroin", 891978678L);
		//String updateActor = service.updateActor(actor);
		//System.out.println(updateActor);
			String actorById = service.removeActorById(29);
			System.out.println(actorById);
		
	}

}
