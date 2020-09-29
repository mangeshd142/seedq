package com.seedq.rest.elastic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.seedq.restinterface.elastic.bean.IQDocumentEEntity;

@Document(indexName = "seed", shards = 2)
public class QDocumentEEntity implements IQDocumentEEntity{
	
	@Id
	private String sid;
	private String title;
	private String description;
	private String comment;
	private String userId;
	
	public QDocumentEEntity() {
		// TODO Auto-generated constructor stub
	}

	public QDocumentEEntity(String sid, String title, String description, String comment, String userId) {
		super();
		this.sid = sid;
		this.title = title;
		this.description = description;
		this.comment = comment;
		this.userId = userId;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
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
