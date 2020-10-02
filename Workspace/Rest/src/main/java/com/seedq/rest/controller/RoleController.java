package com.seedq.rest.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seedq.restinterface.action.ISaveRole;
import com.seedq.restinterface.bean.CommonInterface;
import com.seedq.restinterface.bean.ErrorBeanInterface;
import com.seedq.restinterface.bean.PrepareResponseInterface;
import com.seedq.restinterface.bean.ResponseBeanInterface;

@RestController
public class RoleController {
	
	@Autowired
	PrepareResponseInterface prepareResponseInterface;
	
	@Autowired
	ISaveRole saveRole;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/addRole")
	public ResponseBeanInterface<CommonInterface, ErrorBeanInterface> saveRole(HttpServletResponse servletResponse,
			@RequestBody Map<String, Object> roleMap) throws Exception {
		
		return prepareResponseInterface.excute(servletResponse, saveRole.execute(roleMap));
	}
}
