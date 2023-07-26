package com.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "DATA_JPA_ACTOR")
@Data
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class Actor {
	
	@Id
	@Column(name = "ACTOR_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	@Column(name = "ACTOR_NAME", length = 20)
	//@NonNull
	private String aname;
	@Column(name = "CATEGORY", length = 20)
	//@NonNull
	private String category;
	@Column(name = "MOBILE_NO")
	//@NonNull
	private Long mobileNo;
	
	@Column(name = "STATUS")
	private boolean status;

}
