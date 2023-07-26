package com.data.runner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.data.entity.Person;
import com.data.entity.PhoneNumber;
import com.data.service.IPersonMgmtService;

@Component
public class AssociationMappingTestRunner implements CommandLineRunner {
	
	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {

		Person person = new Person();
		person.setPname("jadu");
		person.setPaddrs("sky");
		
		PhoneNumber phoneNumber1 = new PhoneNumber();
		phoneNumber1.setNumber_type("office");phoneNumber1.setPhone_number(789900988L);phoneNumber1.setProvider("airtel");
		
		PhoneNumber phoneNumber2 = new PhoneNumber();
		phoneNumber2.setNumber_type("home");phoneNumber2.setPhone_number(67899098L);phoneNumber2.setProvider("VI");
		
		phoneNumber1.setPerson(person);
		phoneNumber2.setPerson(person);
		
		//Set<PhoneNumber> phonesSet = Set.of(phoneNumber1, phoneNumber2);
		Set<PhoneNumber> set = new HashSet<PhoneNumber>();
		set.add(phoneNumber1);
		set.add(phoneNumber2);
		
		person.setPhones(set);
		
		try {
			//System.out.println(service.saveDataUsingPerson(person));
			//System.out.println(service.saveDataUsingPhoneNumber(set));
			
			//service.loadDataUsingParent().forEach(per -> {
			//	System.out.println("parent:: "+per);
			// System.out.println("person id:: "+per.getPid()+" person name:: "+per.getPaddrs());
			//Set<PhoneNumber> phones = per.getPhones();
			//phones.forEach(phone -> {
			//	System.out.println(phone);
			//});
		  // });
			
			//System.out.println(service.deletePersonAndHisPhoneNumbers(1000));
		//	System.out.println(service.deletePhoneNumberAndTheirPersonByRegNos(List.of(63, 64)));
			
			//System.out.println(service.deleteAllPhoneNumbersOfaPerson(1001));
			
			System.out.println(service.removeAllPhoneNumbersOfaPersonByPid(1026));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
