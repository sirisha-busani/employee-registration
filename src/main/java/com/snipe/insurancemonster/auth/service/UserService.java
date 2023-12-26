package com.snipe.insurancemonster.auth.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.snipe.insurancemonster.auth.domain.EmployeeDomain;
import com.snipe.insurancemonster.auth.model.EmployeeModel;


public interface UserService extends UserDetailsService{
	
	public UserDetails loadUserByUsername(String username);
	
	public String addUser(EmployeeModel employee);

}
