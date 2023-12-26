package com.snipe.insurancemonster.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static com.snipe.insurancemonster.client.exception.HttpResponseUtils.prepareSuccessResponse;

import com.snipe.insurancemonster.client.common.GenericRes;
import com.snipe.insurancemonster.client.model.EmployeeModel;
import com.snipe.insurancemonster.client.response.Response;
import com.snipe.insurancemonster.client.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Employee", description = "Employee management APIs")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee/{id}")
	@ResponseBody
	public ResponseEntity<GenericRes> getEmployeeById(@PathVariable String id) {
		return prepareSuccessResponse(employeeService.getEmployee(id));
	}
	
//	@GetMapping("/employee")
//	@ResponseStatus(code = HttpStatus.OK)
//	public List<EmployeeModel> getAllEmployees() {
//	
//		return employeeService.getAllEmployees();
//	}
	
	@PostMapping("/employee/register")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<GenericRes> registerEmployee(@RequestBody EmployeeModel employee) {
		return prepareSuccessResponse(employeeService.registerEmployee(employee));
	}
	
	@PutMapping("/employee/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void updateEmployee(@RequestBody EmployeeModel employee,@PathVariable String id) {
		employeeService.updateEmployee(employee);
	}

}
