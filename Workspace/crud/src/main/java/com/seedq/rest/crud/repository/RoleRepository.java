package com.seedq.rest.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seedq.rest.crud.entity.RoleEntity;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, String>{
	RoleEntity findByRole(String role);
}
