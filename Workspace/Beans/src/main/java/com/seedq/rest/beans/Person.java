package com.seedq.rest.beans;

import com.seedq.restinterface.bean.IPerson;

public abstract class Person implements IPerson{
	private String firstName;
	private String lastName;
	
	public Person() {

	}
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
