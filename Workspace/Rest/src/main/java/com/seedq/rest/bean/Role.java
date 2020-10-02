package com.seedq.rest.bean;

import com.seedq.restinterface.bean.IRole;

public class Role implements IRole{
	private String role;
	private String details;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role(String role, String details) {
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
