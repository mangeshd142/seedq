package com.seedq.rest.bean;

import java.util.List;

import org.springframework.stereotype.Component;

import com.seedq.restinterface.bean.ErrorBeanInterface;
import com.seedq.restinterface.bean.ResponseBeanInterface;

@Component
public class ResponseBean<T> implements ResponseBeanInterface<T>{
	
	private List<T> success;
	private ErrorBeanInterface error; 

	
	public List<T> getSuccess() {
		return success;
	}

	public void setSuccess(List<T> success) {
		this.success = success;
	}

	public ErrorBeanInterface getError() {
		return error;
	}

	public void setError(ErrorBeanInterface error) {
		this.error = error;
	}
	
}
