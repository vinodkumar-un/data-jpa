package com.data.service;

import java.util.List;
import java.util.Set;

import com.data.entity.Person;
import com.data.entity.PhoneNumber;

public interface IPersonMgmtService {
	
	public String saveDataUsingPerson(Person person);
	
	public String saveDataUsingPhoneNumber(Set<PhoneNumber> phoneslist);
	
	public List<Person> loadDataUsingParent();
	
	public String deletePersonAndHisPhoneNumbers(int pid);
	public String deletePhoneNumberAndTheirPersonByRegNos(List<Integer> regNos);
	
	public String deleteAllPhoneNumbersOfaPerson(int pid);
	
	public String removeAllPhoneNumbersOfaPersonByPid(int pid);

}
