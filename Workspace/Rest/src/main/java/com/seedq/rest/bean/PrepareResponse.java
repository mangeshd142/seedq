package com.seedq.rest.bean;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seedq.restinterface.bean.CommonInterface;
import com.seedq.restinterface.bean.ErrorBeanInterface;
import com.seedq.restinterface.bean.PrepareResponseInterface;
import com.seedq.restinterface.bean.ResponseBeanInterface;

@Component
public class PrepareResponse implements PrepareResponseInterface{
	
	@Autowired
	ResponseBeanInterface<CommonInterface, ErrorBeanInterface> responseBeanInterface;
	
	@Autowired
	ErrorBeanInterface errorBeanInterface;
	
	public ResponseBeanInterface<CommonInterface, ErrorBeanInterface> excute(HttpServletResponse servletResponse, List<CommonInterface> commonInterface){
		
		try {
			responseBeanInterface.setSuccess(commonInterface);
			return responseBeanInterface;
		} catch (Exception e) {
			servletResponse.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR); 
			
			System.out.println(e.getStackTrace());
			//e.getStackTrace()[0].
			errorBeanInterface.setError(e.toString());
			List<ErrorBeanInterface> errorBeanInterfaces = new ArrayList<ErrorBeanInterface>();
			errorBeanInterfaces.add(errorBeanInterface);
			responseBeanInterface.setError(errorBeanInterfaces);
			return responseBeanInterface;
		}
		
	}

}

