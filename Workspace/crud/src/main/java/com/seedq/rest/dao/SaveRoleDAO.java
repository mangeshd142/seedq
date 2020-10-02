package com.seedq.rest.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seedq.rest.crud.entity.RoleEntity;
import com.seedq.rest.crud.repository.RoleRepository;
import com.seedq.restinterface.crud.ISaveRoleDAO;
import com.seedq.restinterface.crud.bean.IRoleEntity;

@Service
public class SaveRoleDAO implements ISaveRoleDAO{

	@Autowired
	RoleRepository roleRepository;
	
	public IRoleEntity execute(Map<String, Object> roleMap) {
		String role = (String)roleMap.get("role");
		String details = (String)roleMap.get("details");
		RoleEntity roleEntity = new RoleEntity(role, details);
		return roleRepository.save(roleEntity);
	}
}
