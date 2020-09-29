package com.seedq.rest.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seedq.rest.beans.User;
import com.seedq.restinterface.action.FetchUserInterface;
import com.seedq.restinterface.bean.CommonInterface;
import com.seedq.restinterface.crud.IFetchUserDAO;
import com.seedq.restinterface.crud.bean.IUserEntity;

@Component
public class FetchUser implements FetchUserInterface{

	@Autowired
	IFetchUserDAO fetchUserDao;
	
	@Override
	public List<CommonInterface> execute() {
		// TODO Auto-generated method stub
		List<CommonInterface> userList = new ArrayList<>();
		
		
		List<IUserEntity> userEntityList = fetchUserDao.exicute();
		
		Iterator<IUserEntity> iterator = userEntityList.iterator();
		
		while (iterator.hasNext()) {
			User user = new User();
			IUserEntity userEntity = iterator.next();
			user.setFirstName(userEntity.getFirstName());
			user.setLastName(userEntity.getLastName());
			user.setEmail(userEntity.getEmail());
			user.setIsActive(userEntity.getIsActive());
			
			userList.add(user);
		}
		
		
		return userList;
	}
	
}
