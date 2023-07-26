package com.app;

public class Employee extends Person {

	@Override
	public String toString() {
		return "Employee [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
