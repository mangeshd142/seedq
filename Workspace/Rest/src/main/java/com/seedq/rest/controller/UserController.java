package com.seedq.rest.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seedq.restinterface.action.FetchUserInterface;
import com.seedq.restinterface.bean.CommonInterface;
import com.seedq.restinterface.bean.ErrorBeanInterface;
import com.seedq.restinterface.bean.PrepareResponseInterface;
import com.seedq.restinterface.bean.ResponseBeanInterface;

@RestController
public class ProfileController {
	
	@Autowired
	PrepareResponseInterface prepareResponseInterface;
	
	@Autowired
	FetchUserInterface fetchUser;
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/profile")
	public ResponseBeanInterface<CommonInterface, ErrorBeanInterface> getProfile(HttpServletResponse servletResponse) throws Exception {
		
		return prepareResponseInterface.excute(servletResponse, fetchUser.execute());
	}
}
