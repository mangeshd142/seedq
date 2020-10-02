package com.seedq.rest.crud.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.seedq.restinterface.crud.bean.IRoleEntity;
import com.seedq.restinterface.crud.bean.IUserEntity;

@Entity
@Table(name = "user_table")
public class UserEntity extends PersonEntity implements IUserEntity{
	
	@Column(unique = true)
	private String email;
	
	private String password;
	
	private boolean isActive;
	
	@ManyToMany(
			targetEntity=RoleEntity.class,
			fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", 
		joinColumns = @JoinColumn(name = "user_id"), 
		inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<IRoleEntity> roleEntity;
	
	public UserEntity() {

	}
	
	public UserEntity(String firstName, String lastName, String email, String password, boolean isActive, List<IRoleEntity> roleEntity) {
		super(firstName, lastName);
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		this.roleEntity = roleEntity;
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

	public List<IRoleEntity> getRoleEntity() {
		return roleEntity;
	}

	@Override
	public void setRoleEntity(List<IRoleEntity> roleEntity) {
		this.roleEntity = roleEntity;
	}

}
