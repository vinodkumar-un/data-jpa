package com.data.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.data.entity.EmployeeInfo;
import com.data.repository.EmployeeInfoRepository;

@Component
public class CollectionMappingTestRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeInfoRepository empRepo;
	
	@Override
	public void run(String... args) throws Exception {

		EmployeeInfo info = new EmployeeInfo();
		info.setEname("jadu");
		info.setFriends(List.of("williamson", "livingstone", "johnson"));
		info.setPhones(Set.of(987889L, 3345676L));
		info.setIdDetails(Map.of("aadhar", 876556L, "panno",987789L));
		
		//System.out.println("Employee is saved with:: "+empRepo.save(info).getEno()+" id value");
		
		List<EmployeeInfo> list = empRepo.findAll();
		list.forEach(System.out::println);
		// empRepo.deleteById(2);
	}

}
