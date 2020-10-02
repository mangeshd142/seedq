package com.seedq.restinterface.crud.bean;

import java.util.List;

public interface IUserEntity extends IPersonEntity{
	public String getEmail();

	public void setEmail(String email);

	public String getPassword();

	public void setPassword(String password);

	public boolean getIsActive();

	public void setIsActive(boolean isActive);
	
	public List<IRoleEntity> getRoleEntity();

	public void setRoleEntity(List<IRoleEntity> role);
}
