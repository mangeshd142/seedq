package com.seedq.rest.crud.entity;

import javax.persistence.MappedSuperclass;

import com.seedq.restinterface.crud.bean.IPersonEntity;

@MappedSuperclass
public abstract class PersonEntity extends BaseEntity implements IPersonEntity{

	private String firstName;
	private String lastName;
	
	public PersonEntity() {
		super();
	}

	public PersonEntity(String firstName, String lastName) {
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
