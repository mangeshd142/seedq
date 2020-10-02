package com.seedq.rest.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.seedq.rest.action.FetchUser;
import com.seedq.restinterface.crud.bean.IRoleEntity;
import com.seedq.restinterface.crud.bean.IUserEntity;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    FetchUser fetchUser;
	
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        IUserEntity userEntity = fetchUser.fetchUserByEmail(userName);
        if(userEntity != null) {
        	
        	List<String> roleList = new ArrayList<String>();
        	for(IRoleEntity role:userEntity.getRoleEntity()) {
        		roleList.add(role.getRole());
        	}
        	
            return User.builder()
            	.username(userEntity.getEmail())
            	//change here to store encoded password in db
            	.password( getPasswordEncoder().encode(userEntity.getPassword()) )
            	.disabled(!userEntity.getIsActive())
            	.accountExpired(!userEntity.getIsActive())
            	.accountLocked(!userEntity.getIsActive())
            	.credentialsExpired(!userEntity.getIsActive())
            	.roles(roleList.toArray(new String[0]))
            	.build();
        } else {
        	throw new UsernameNotFoundException("User Name is not Found");
        }   
    }
    
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}