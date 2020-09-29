package com.seedq.restinterface.crud;

import java.util.Map;

import com.seedq.restinterface.crud.bean.IUserEntity;

public interface ISaveUserDao {
	public IUserEntity execute(Map<String, Object> user);
	
}
