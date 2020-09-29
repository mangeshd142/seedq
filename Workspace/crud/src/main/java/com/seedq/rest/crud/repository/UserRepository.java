package com.seedq.rest.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seedq.rest.crud.entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

}
