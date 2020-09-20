package com.seedq.rest.bean;

import org.springframework.stereotype.Component;

import com.seedq.restinterface.bean.ErrorBeanInterface;

@Component
public class ErrorBean implements ErrorBeanInterface{
	String error;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
