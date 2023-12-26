package com.snipe.insurancemonster.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.snipe.insurancemonster.auth.common.GenericRes;
import com.snipe.insurancemonster.auth.exception.HttpResponseUtils;
import com.snipe.insurancemonster.auth.model.AuthModel;
import com.snipe.insurancemonster.auth.model.EmployeeModel;
import com.snipe.insurancemonster.auth.service.AuthService;
import com.snipe.insurancemonster.auth.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/auth/employee/register")
	public ResponseEntity<GenericRes> registerEmployee(EmployeeModel employee) {
		
		System.out.println("registeremployee");
	//	ResponseEntity<GenericRes> response = new RestTemplate().getForEntity("http://localhost:8093/test", GenericRes.class);
		return HttpResponseUtils.prepareSuccessResponse(userService.addUser(employee));
		
		//return response;
	}
	
	@PostMapping("/auth/test")
	public ResponseEntity<GenericRes> test(EmployeeModel model){
		System.out.println("model is " + model.getFirstName());
		ResponseEntity<GenericRes> response = new RestTemplate().postForEntity("http://localhost:8093/test/post", model,GenericRes.class);
		System.out.println("in test method");
		return response;
	}

}
