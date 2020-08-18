package com.seedq.restinterface.bean;

import java.util.List;


public interface ResponseBeanInterface<T> {
	public List<T> getSuccess();

	public void setSuccess(List<T> sucess);
	
	public ErrorBeanInterface getError();
	
	public void setError(ErrorBeanInterface error);
}
