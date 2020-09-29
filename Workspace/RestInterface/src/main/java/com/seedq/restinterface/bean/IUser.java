package com.seedq.restinterface.bean;

public interface IUser extends IPerson{
	public String getEmail();
	public void setEmail(String email);
	public boolean getIsActive();
	public void setIsActive(boolean isActive);
}
