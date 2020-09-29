package com.seedq.restinterface.bean;

public interface IQDocument extends CommonInterface{

	public String getTitle();

	public void setTitle(String title);

	public String getDescription();

	public void setDescription(String description);

	public String getComment();

	public void setComment(String comment);

	public String getUserId();

	public void setUserId(String userId);
}
