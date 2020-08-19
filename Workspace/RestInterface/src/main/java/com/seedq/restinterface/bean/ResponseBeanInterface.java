package com.seedq.restinterface.bean;

import java.util.List;


public interface ResponseBeanInterface<T, E> {
	public List<T> getSuccess();

	public void setSuccess(List<T> sucess);
	
	public List<E> getError();

	public void setError(List<E> error);
}
