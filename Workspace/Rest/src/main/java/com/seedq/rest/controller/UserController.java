package com.seedq.rest.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seedq.restinterface.action.FetchUserInterface;
import com.seedq.restinterface.action.ISaveUser;
import com.seedq.restinterface.bean.CommonInterface;
import com.seedq.restinterface.bean.ErrorBeanInterface;
import com.seedq.restinterface.bean.PrepareResponseInterface;
import com.seedq.restinterface.bean.ResponseBeanInterface;

@RestController
public class UserController {

	@Autowired
	PrepareResponseInterface prepareResponseInterface;

	@Autowired
	FetchUserInterface fetchUser;

	@Autowired
	ISaveUser saveUser;

	@CrossOrigin(origins = "*")
	@RequestMapping("/fetchUsers")
	public ResponseBeanInterface<CommonInterface, ErrorBeanInterface> getUsers(HttpServletResponse servletResponse)
			throws Exception {

		return prepareResponseInterface.excute(servletResponse, fetchUser.execute());
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/addUser")
	public ResponseBeanInterface<CommonInterface, ErrorBeanInterface> addUser(HttpServletResponse servletResponse,
			@RequestBody Map<String, Object> userMap) throws Exception {

		return prepareResponseInterface.excute(servletResponse, saveUser.execute(userMap));
	}

}
