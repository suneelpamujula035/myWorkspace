package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {

	private int personId;
	private String prrsonName;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pDetail_FK")
	private PersonDetails pDetails;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPrrsonName() {
		return prrsonName;
	}

	public void setPrrsonName(String prrsonName) {
		this.prrsonName = prrsonName;
	}

	public PersonDetails getpDetails() {
		return pDetails;
	}

	public void setpDetails(PersonDetails pDetails) {
		this.pDetails = pDetails;
	}
	
	
}
