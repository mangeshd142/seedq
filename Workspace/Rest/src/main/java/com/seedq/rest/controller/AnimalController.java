package com.seedq.rest.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seedq.restinterface.action.FetchAnimalsInterface;
import com.seedq.restinterface.bean.CommonInterface;
import com.seedq.restinterface.bean.ErrorBeanInterface;
import com.seedq.restinterface.bean.PrepareResponseInterface;
import com.seedq.restinterface.bean.ResponseBeanInterface;

@RestController
public class AnimalController {
	
	@Autowired
	PrepareResponseInterface prepareResponse;
	
	@Autowired
	FetchAnimalsInterface fetchAnimals; 
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/animals")
	public ResponseBeanInterface<CommonInterface, ErrorBeanInterface> getAnimal(HttpServletResponse servletResponse) throws Exception {
		
		return prepareResponse.excute(servletResponse, fetchAnimals.execute());
	}
	
}
