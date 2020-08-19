package com.seedq.rest.bean;

import java.util.List;

import org.springframework.stereotype.Component;

import com.seedq.restinterface.bean.ResponseBeanInterface;

@Component
public class ResponseBean<T, E> implements ResponseBeanInterface<T, E>{
	
	private List<T> success;
	private List<E> error; 

	public List<T> getSuccess() {
		return success;
	}

	public void setSuccess(List<T> success) {
		this.success = success;
	}

	public List<E> getError() {
		return error;
	}

	public void setError(List<E> error) {
		this.error = error;
	}
	
}
