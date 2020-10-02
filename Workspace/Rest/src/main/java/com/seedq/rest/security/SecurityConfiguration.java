package com.seedq.rest.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	UserDetailsService userDetailsService;

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
		/*auth.inMemoryAuthentication()
		.withUser("mangesh")
		.password("mangesh")
		.roles("user");*/
	}
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		List<String> urls = new ArrayList<String>();
		urls.add("/about");
		urls.add("/addUser");
		
		http.csrf().disable().authorizeRequests()
		.antMatchers("/help")
		.hasRole("user")
		.antMatchers(urls.toArray(new String[urls.size()]))
		.permitAll()
		.and().httpBasic();
	}
	

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
}
