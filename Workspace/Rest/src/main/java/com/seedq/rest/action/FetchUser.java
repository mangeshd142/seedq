package com.seedq.rest.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.seedq.rest.bean.UserBean;
import com.seedq.restinterface.action.FetchUserInterface;
import com.seedq.restinterface.bean.CommonInterface;

@Component
public class FetchUser implements FetchUserInterface{

	@Override
	public List<CommonInterface> execute() {
		// TODO Auto-generated method stub
		List<CommonInterface> userBeans = new ArrayList<CommonInterface>();
		userBeans.add(new UserBean("Mangesh", "mangesh142", "mangeshd142@gmail.com"));
		userBeans.add(new UserBean("Ajay", "mangesh142", "mangeshd142@gmail.com"));
		userBeans.add(new UserBean("Nilesh", "mangesh142", "mangeshd142@gmail.com"));
		
		return userBeans;
	}
	
}
