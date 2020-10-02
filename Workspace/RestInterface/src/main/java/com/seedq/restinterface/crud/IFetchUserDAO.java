package com.seedq.restinterface.crud;

import java.util.List;

import com.seedq.restinterface.crud.bean.IUserEntity;

public interface IFetchUserDAO {
	public List<IUserEntity> exicute();
	public IUserEntity fetchUserByEmail(String email);
}
