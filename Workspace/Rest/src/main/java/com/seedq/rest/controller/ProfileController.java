package com.seedq.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seedq.rest.bean.UserBean;
import com.seedq.restinterface.bean.ResponseBeanInterface;

@RestController
public class ProfileController {
	@Autowired
	ResponseBeanInterface<UserBean> responseBean;
	
	@RequestMapping("/profile")
	public ResponseBeanInterface<UserBean> getProfile() {
		
		List<UserBean> userBeans = new ArrayList<UserBean>();
		userBeans.add(new UserBean("Mangesh", "mangesh142", "mangeshd142@gmail.com"));
		userBeans.add(new UserBean("Ajay", "mangesh142", "mangeshd142@gmail.com"));
		userBeans.add(new UserBean("Nilesh", "mangesh142", "mangeshd142@gmail.com"));

		responseBean.setSuccess(userBeans);
		
		return responseBean;
	}
}
