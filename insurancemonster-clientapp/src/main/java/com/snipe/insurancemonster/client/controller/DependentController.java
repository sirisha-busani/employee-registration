package com.snipe.insurancemonster.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.snipe.insurancemonster.client.common.GenericRes;
import com.snipe.insurancemonster.client.model.DependentModel;
import com.snipe.insurancemonster.client.model.EmployeeModel;
import com.snipe.insurancemonster.client.service.DependentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import static com.snipe.insurancemonster.client.exception.HttpResponseUtils.prepareSuccessResponse;
@RestController
@Tag(name = "Dependent", description = "Dependent management APIs")
public class DependentController {
	
	@Autowired
	DependentService dependentService;
	
	@Operation(summary="Get list of dependents for an employee")
	@GetMapping("/employee/dependents/{employeeId}")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<GenericRes> getDependents(@PathVariable String employeeId) {
		return prepareSuccessResponse(dependentService.getDependents(employeeId));
	}
	
//	@Operation(summary="Get list of all dependents")
//	@GetMapping("/employee/dependents")
//	@ResponseStatus(code = HttpStatus.OK)
//	public List<DependentModel> getAllDependents() {
//	
//		return dependentService.getAllDependents();
//	}
	
	@Operation(summary="Get dependent details")
	@GetMapping("/employee/dependent/{dependentId}")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<GenericRes> getDependentDetails(@PathVariable String dependentId) {
		return prepareSuccessResponse(dependentService.getDependentDetails(dependentId));
	}
	
	@Operation(summary="Add dependent details")
	@PostMapping("/employee/dependent")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<GenericRes> addDependent(@RequestBody DependentModel dependent) {
		return prepareSuccessResponse(dependentService.addDependent(dependent));
	}
	
//	@Operation(summary="Update dependent details")
//	@PatchMapping("/employee/dependent/{id}")
//	@ResponseStatus(code = HttpStatus.OK)
//	public void updateDependent(@RequestBody DependentModel dependent,@PathVariable String id) {
//		dependent.setId(id);
//		dependentService.updateDependent(dependent);
//	}
	
//	@DeleteMapping("/employee/dependent/{id}")
//	@ResponseStatus(code = HttpStatus.OK)
//	public DependentModel deleteDependent(@PathVariable String id) {
//		return dependentService.deleteDependent(id);
//	}

}
