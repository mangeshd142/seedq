package com.seedq.rest.bean;

import com.seedq.restinterface.bean.AnimalBeanInterface;

public class AnimalBean implements AnimalBeanInterface{
	private String type;
	private String speek;
	private String legs;
	
	public AnimalBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	public AnimalBean(String type, String speek, String legs) {
		super();
		this.type = type;
		this.speek = speek;
		this.legs = legs;
	}


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSpeek() {
		return speek;
	}
	public void setSpeek(String speek) {
		this.speek = speek;
	}
	public String getLegs() {
		return legs;
	}
	public void setLegs(String legs) {
		this.legs = legs;
	}
	
	

}
