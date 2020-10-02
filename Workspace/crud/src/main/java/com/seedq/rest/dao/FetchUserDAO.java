package com.seedq.rest.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seedq.rest.crud.repository.UserRepository;
import com.seedq.restinterface.crud.IFetchUserDAO;
import com.seedq.restinterface.crud.bean.IUserEntity;

@Component
public class FetchUserDAO implements IFetchUserDAO{

	@Autowired
	public UserRepository userRepository;
	
	@Override
	public List<IUserEntity> exicute() {
		
		List<IUserEntity> userList = new ArrayList<>();
		userList.addAll(userRepository.findAll());
		
		return userList;
	}
	
	public IUserEntity fetchUserByEmail(String email){
		return userRepository.findByEmail(email);
	}

	
}
