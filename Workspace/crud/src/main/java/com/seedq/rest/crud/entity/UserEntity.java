package com.seedq.rest.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.seedq.restinterface.crud.bean.IUserEntity;

@Entity
@Table(name = "user_entity")
public class UserEntity extends PersonEntity implements IUserEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String pid;
	
	@Column(unique = true)
	private String email;
	
	private String password;
	
	private boolean isActive;
	
	public UserEntity() {

	}
	
	public UserEntity(String firstName, String lastName, String pid, String email, String password, boolean isActive) {
		super(firstName, lastName);
		this.pid = pid;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	
}
