package com.seedq.rest.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seedq.rest.bean.Role;
import com.seedq.restinterface.action.ISaveRole;
import com.seedq.restinterface.bean.CommonInterface;
import com.seedq.restinterface.bean.IRole;
import com.seedq.restinterface.crud.ISaveRoleDAO;
import com.seedq.restinterface.crud.bean.IRoleEntity;

@Component
public class SaveRole implements ISaveRole{
	
	@Autowired
	ISaveRoleDAO saveRoleDAO;

	@Override
	public List<CommonInterface> execute(Map<String, Object> roleMap) {
		List<CommonInterface> commonInterfaces = new ArrayList<CommonInterface>();
		IRoleEntity roleEntity = saveRoleDAO.execute(roleMap);
		
		IRole role = new Role(roleEntity.getRole(), roleEntity.getDetails());
		commonInterfaces.add(role);
		return commonInterfaces;
	}

	
}
