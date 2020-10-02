package com.seedq.restinterface.crud;

import java.util.Map;

import com.seedq.restinterface.crud.bean.IRoleEntity;

public interface ISaveRoleDAO {
	public IRoleEntity execute(Map<String, Object> user);
}
