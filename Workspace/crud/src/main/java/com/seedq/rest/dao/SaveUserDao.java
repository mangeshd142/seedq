package com.seedq.rest.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seedq.rest.crud.entity.UserEntity;
import com.seedq.rest.crud.repository.UserRepository;
import com.seedq.restinterface.crud.ISaveUserDao;
import com.seedq.restinterface.crud.bean.IUserEntity;

@Component
public class SaveUserDao implements ISaveUserDao{

	@Autowired
	UserRepository userrepository;
	
	@Override
	public IUserEntity execute(Map<String, Object> user) {
		
		UserEntity userEntity= new UserEntity();
		userEntity.setEmail((String)user.get("email"));
		userEntity.setFirstName((String)user.get("firstName"));
		userEntity.setLastName((String)user.get("lastName"));
		userEntity.setPassword((String)user.get("password"));
		userEntity.setIsActive(true);
		
		return userrepository.save(userEntity);
	}

}
