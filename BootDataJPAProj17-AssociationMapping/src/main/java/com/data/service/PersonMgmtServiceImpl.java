package com.data.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.entity.Person;
import com.data.entity.PhoneNumber;
import com.data.repository.IPersonRepository;
import com.data.repository.IPhoneNumberRepository;

@Service("personService")
public class PersonMgmtServiceImpl implements IPersonMgmtService {
	
	@Autowired
	private IPersonRepository personRepo;
	
	@Autowired
	private IPhoneNumberRepository phoneNumberRepo;

	@Override
	public String saveDataUsingPerson(Person person) {
		;
		return "person and his phone numbers saved with "+personRepo.save(person)+" id value";
	}

	/*	@Override
		public String saveDataUsingPhoneNumber(List<PhoneNumber> phonesList) {
			List<String> msgs = new ArrayList<>();
			if(phonesList.size() > 0) {
				for(PhoneNumber phone : phonesList) {
					 msgs.add("PhoneNumbers and his Person are saved with "+phoneNumberRepo.save(phone)+" id value");
				}
			}
			return msgs.toString();
		}*/
	
	@Override
	public String saveDataUsingPhoneNumber(Set<PhoneNumber> phoneslist) {
		int count = phoneNumberRepo.saveAll(phoneslist).size();
		return count+" no. of phone numbers objs mapped to person obj is saved";
	}
	
	@Override
	public List<Person> loadDataUsingParent() {
		
		List<Person> persons = personRepo.findAll();
		return persons;
	}
	
	@Override
	public String deletePersonAndHisPhoneNumbers(int pid) {
		
		Optional<Person> optional = personRepo.findById(pid);
		
		if(optional.isEmpty()) {
			return "person not found";
		}else {
			Person person = optional.get();
			personRepo.delete(person);
			return pid+" Person and his PhoneNumbers are deleted";
		}
	}
	
	@Override
	public String deletePhoneNumberAndTheirPersonByRegNos(List<Integer> regNos) {
		List<PhoneNumber> listPhones = phoneNumberRepo.findAllById(regNos);
		if(listPhones.size() == 0) {
			return "Given phone numbers are not found";
		}else {
			phoneNumberRepo.deleteAll(listPhones);
			return listPhones.size()+" phone numbers and the associated parent obj is deleted";
		}
	}
	
	@Override
	public String deleteAllPhoneNumbersOfaPerson(int pid) {
		Optional<Person> optional = personRepo.findById(pid);
		if(optional.isEmpty()) {
			return "Person not found";
		} else {
			Person person = optional.get();
			Set<PhoneNumber> phones = person.getPhones();
			int count = phones.size();
			for(PhoneNumber phone : phones) {
				phoneNumberRepo.delete(phone);
				person.setPhones(null);
				personRepo.save(person); 
			}
			return count+" no. of phonenumbers are deleted for the person "+pid;
		}
	}
	
	@Override
	public String removeAllPhoneNumbersOfaPersonByPid(int pid) {
			Optional<Person> opt = personRepo.findById(pid);
			if(opt.isEmpty()) {
				return "person not found";
			}else {
				int count = phoneNumberRepo.deleteAllPhoneNumbersOfaPersonByPid(pid);
				return count+" no. of phone numbers are deleted";
			}
	}

}
