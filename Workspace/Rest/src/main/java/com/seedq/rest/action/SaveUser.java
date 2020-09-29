package com.seedq.rest.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seedq.rest.beans.User;
import com.seedq.restinterface.action.ISaveUser;
import com.seedq.restinterface.bean.CommonInterface;
import com.seedq.restinterface.bean.IUser;
import com.seedq.restinterface.crud.ISaveUserDao;
import com.seedq.restinterface.crud.bean.IUserEntity;

@Component
public class SaveUser implements ISaveUser{

	@Autowired
	ISaveUserDao saveUser;
	
	@Override
	public List<CommonInterface> execute(Map<String, Object> userMap) {
		
		List<CommonInterface> userList = new ArrayList<CommonInterface>();
		IUserEntity userEntity = saveUser.execute(userMap);
		IUser user = new User(); 
		user.setEmail(userEntity.getEmail());
		user.setFirstName(userEntity.getFirstName());
		user.setLastName(userEntity.getLastName());
		user.setIsActive(userEntity.getIsActive());
		
		
		userList.add(user);
		
		return userList;
	}

}
