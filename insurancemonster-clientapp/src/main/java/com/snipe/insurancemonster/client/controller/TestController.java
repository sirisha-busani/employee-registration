package com.snipe.insurancemonster.client.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.snipe.insurancemonster.client.common.GenericRes;
import com.snipe.insurancemonster.client.exception.HttpResponseUtils;
import com.snipe.insurancemonster.client.model.EmployeeModel;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public ResponseEntity<GenericRes> getCities(){
		
		
		
//		ResponseEntity<GenericRes> response = new RestTemplate().getForEntity("http://localhost:8091/location/test", GenericRes.class);
//		System.out.println("response is " + response);
		return HttpResponseUtils.prepareSuccessResponse("Success");
	}
	
	@PostMapping("/test/post")
	public ResponseEntity<GenericRes> testPostEntity(@RequestBody EmployeeModel employee){
		System.out.println("employee " + employee.getFirstName());
		return HttpResponseUtils.prepareSuccessResponse("Success");
	}

}
