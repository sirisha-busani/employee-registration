package com.snipe.insurancemonster.auth.controller;

import static com.snipe.insurancemonster.auth.exception.HttpResponseUtils.prepareSuccessResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snipe.insurancemonster.auth.common.GenericRes;
import com.snipe.insurancemonster.auth.domain.UserDetailsDomain;
import com.snipe.insurancemonster.auth.exception.HttpResponseUtils;
import com.snipe.insurancemonster.auth.model.AuthModel;
import com.snipe.insurancemonster.auth.model.EmployeeModel;
import com.snipe.insurancemonster.auth.service.AuthService;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
	
	@Autowired
	AuthService authService;
	
	@PostMapping("/signin")
	public ResponseEntity<GenericRes> signIn(@RequestBody AuthModel authModel) {
		System.out.println("In signin ");
		return prepareSuccessResponse(authService.signIn(authModel));
	}
	
	@PostMapping("/auth/employee/register")
	public ResponseEntity<GenericRes> registerEmployee(@RequestBody EmployeeModel employee) {
		
		System.out.println("registeremployee");
	//	ResponseEntity<GenericRes> response = new RestTemplate().getForEntity("http://localhost:8093/test", GenericRes.class);
		return HttpResponseUtils.prepareSuccessResponse(authService.addUser(employee));
		
		//return response;
	}
	
}
