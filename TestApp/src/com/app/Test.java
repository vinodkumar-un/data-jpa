package com.app;

import java.util.Date;

public class Test {
	
	public <T> T showDetails(Class<T> clazz)throws Exception {
		
		return (T)clazz.getDeclaredConstructor(new Class[] {}).newInstance();
	}
	
	public <T extends Person> T showDetails1(Class<T> clazz) throws Exception {
		return clazz.getDeclaredConstructor(new Class[] {}).newInstance();
	}
	
	public static void main(String[] args) throws Exception {
		
		Test test = new Test();
		Person person = test.showDetails(Person.class);
		System.out.println(person);
		Employee employee = test.showDetails(Employee.class);
		System.out.println(employee);
		Student student = test.showDetails(Student.class);
		System.out.println(student);
		Date date = test.showDetails(Date.class);
		System.out.println(date);
		
		System.out.println("==========================================");
		
		Test test1 = new Test();
		Person person1 = test.showDetails1(Person.class);
		System.out.println(person1);
		Employee employee1 = test.showDetails1(Employee.class);
		System.out.println(employee1);
		Student student1 = test.showDetails1(Student.class);
		System.out.println(student1);
		//Date date1 = test.showDetails1(Date.class);
		//System.out.println(date1);
		
		
	}

}
