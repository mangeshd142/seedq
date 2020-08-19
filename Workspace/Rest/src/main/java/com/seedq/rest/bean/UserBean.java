package com.seedq.rest.bean;

import com.seedq.restinterface.bean.UserBeanInterface;

public class UserBean implements UserBeanInterface{
	private String name;
	private String userNaame;
	private String email;
	
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
	
	public UserBean(String name, String userNaame, String email) {
		super();
		this.name = name;
		this.userNaame = userNaame;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserNaame() {
		return userNaame;
	}
	public void setUserNaame(String userNaame) {
		this.userNaame = userNaame;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
