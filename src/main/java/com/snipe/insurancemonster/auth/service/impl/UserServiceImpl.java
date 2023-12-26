package com.snipe.insurancemonster.auth.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.snipe.insurancemonster.auth.config.HttpConfig;
import com.snipe.insurancemonster.auth.domain.EmployeeDomain;
import com.snipe.insurancemonster.auth.model.EmployeeModel;
import com.snipe.insurancemonster.auth.repository.UserDetailsRepository;
import com.snipe.insurancemonster.auth.service.UserService;
import com.snipe.insurancemonster.auth.util.PasswordUtil;
import com.snipe.insurancemonster.auth.domain.RoleDomain;
import com.snipe.insurancemonster.auth.domain.UserDetailsDomain;
import com.snipe.insurancemonster.auth.common.GenericRes;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDetailsRepository userRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
	}

	@Override
	public String addUser(EmployeeModel employee) {
		// TODO Auto-generated method stub
		System.out.println("restTemplate is " + restTemplate);
		System.out.println(PasswordUtil.generateCommonLangPassword());
		System.out.println(PasswordUtil.generateCommonLangPassword());
		System.out.println(PasswordUtil.generateCommonLangPassword());;
		
//UserDetailsDomain userDomain = new UserDetailsDomain();
//		
//		BeanUtils.copyProperties(employee, userDomain);
//		userDomain.setCreatedDate(LocalDateTime.now());
		//userDomain.setPassword(passwordEncoder.encode("password"));
//		RoleDomain role = new RoleDomain();
//		role.setId(4);
//		userDomain.setRole(role);
//		UserDetailsDomain user = userRepository.save(userDomain);
//		employee.setId(user.getId());
//		restTemplate.postForEntity("http://localhost:8093/test/post", employee,GenericRes.class);
//		return user.getId();
		return "success";
	}


}
