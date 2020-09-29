package com.seedq.rest.beans;

import org.springframework.stereotype.Component;

import com.seedq.restinterface.bean.IUser;

@Component
public class User extends Person implements IUser{
	
	private String email;
	private boolean isActive;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	
}
