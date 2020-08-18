package com.seedq.rest.bean;

import java.util.List;

import com.seedq.restinterface.bean.ErrorBeanInterface;

public class ErrorBean implements ErrorBeanInterface{
	List error;

	public List getError() {
		return error;
	}

	public void setError(List error) {
		this.error = error;
	}
}
