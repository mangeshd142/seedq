package com.seedq.rest.crud.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

import com.seedq.restinterface.crud.bean.IBaseEntity;

@MappedSuperclass
public abstract class BaseEntity implements IBaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	public BaseEntity() {
		
	}
	
	public BaseEntity(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
