package com.seedq.restinterface.crud.bean;

public interface IUserEntity extends IPersonEntity{
	public String getEmail();

	public void setEmail(String email);

	public String getPassword();

	public void setPassword(String password);

	public boolean getIsActive();

	public void setIsActive(boolean isActive);
	
	public String getPid();

	public void setPid(String pid);
}
