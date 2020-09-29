package com.seedq.rest.beans;

import com.seedq.restinterface.bean.IQDocument;

public class QDocument implements IQDocument{

	private String title;
	private String description;
	private String comment;
	private String userId;
	
	public QDocument() {
		// TODO Auto-generated constructor stub
	}

	public QDocument(String title, String description, String comment, String userId) {
		super();
		
		this.title = title;
		this.description = description;
		this.comment = comment;
		this.userId = userId;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
