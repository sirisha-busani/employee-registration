package com.snipe.insurancemonster.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.snipe.insurancemonster.client.model.HospitalVisitModel;
import com.snipe.insurancemonster.client.model.OutpatientVisitModel;
import com.snipe.insurancemonster.client.service.OutpatientVisitService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Outpatient visits", description = "Outpatient visits management APIs")
public class OutpatientVisitController {
	
	@Autowired
	OutpatientVisitService service;
	
	
	@GetMapping("/visits/outpatient/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public OutpatientVisitModel getOutpatientVisit(@PathVariable String id) {
		return service.getOutpatientVisit(id);
	}
	
	
	@PostMapping("/visits/outpatient")
	@ResponseStatus(code = HttpStatus.OK)
	public OutpatientVisitModel addOutpatientVisit(@RequestBody OutpatientVisitModel outpatient) {
		return service.addOutpatientVisit(outpatient);
	}
	
	@PutMapping("/visits/outpatient")
	@ResponseStatus(code = HttpStatus.OK)
	public OutpatientVisitModel updateOutpatientVisit(@RequestBody OutpatientVisitModel outpatient) {
		return service.updateOutpatientVisit(outpatient);
	}
	
//	@GetMapping("/visits/outpatient/employee/{employeeId}")
//	@ResponseStatus(code = HttpStatus.OK)
//	public List<OutpatientModel> getAllOutpatientVisitsByEmployee(String employeeId) {
//	
//		return service.getAllOutpatientVisitsByEmployee(employeeId);
//	}
	
	@GetMapping("/visits/outpatient/dependent/{dependentId}")
	@ResponseStatus(code = HttpStatus.OK)
	public List<OutpatientVisitModel> getAllOutpatientVisitsByDependent(String dependentId) {
	
		return service.getAllOutpatientVisitsByDependent(dependentId);
	}

}
