package com.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DATA_JPA_ACCOUNT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	
	@Id
	private int acno;
	private String holderName;
	private double amount;
}
