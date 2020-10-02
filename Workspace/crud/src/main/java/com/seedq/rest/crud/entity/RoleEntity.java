package com.seedq.rest.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.seedq.restinterface.crud.bean.IRoleEntity;

@Entity
@Table(name = "role_table")
public class RoleEntity extends BaseEntity implements IRoleEntity{
	
	@Column(unique = true)
	private String role;
	private String details;
	
	public RoleEntity() {

	}

	public RoleEntity(String role, String details) {
		super();
		this.role = role;
		this.details = details;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
}
