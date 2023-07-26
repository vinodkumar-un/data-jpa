package com.data.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PHONE_NUMBER_OTM")
public class PhoneNumber {
	
	@Id
	@GeneratedValue
	private int regNo;
	private long phone_number;
	@Column(length = 20)
	private String number_type;
	@Column(length = 20)
	private String provider;
	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON_ID", referencedColumnName = "PID")
	private Person person;
	
	
	
	
	public PhoneNumber() {
		System.out.println("Phone number :: 0- param constructor "+this.getClass());
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getNumber_type() {
		return number_type;
	}
	public void setNumber_type(String number_type) {
		this.number_type = number_type;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", phone_number=" + phone_number + ", number_type=" + number_type
				+ ", provider=" + provider + "]";
	}
	
	
	
	

}
