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

import com.snipe.insurancemonster.client.model.MedicalLabVisitModel;
import com.snipe.insurancemonster.client.model.PharmaVisitModel;
import com.snipe.insurancemonster.client.service.PharmaVisitService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Pharma Visits", description = "Pharma Visits management APIs")
public class PharmaVisitController {
	
	@Autowired
	PharmaVisitService service;
	
	
	@GetMapping("/visits/pharma/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public PharmaVisitModel getPharmaVisit(@PathVariable String id) {
		return service.getPharmaVisit(id);
	}
	
	
	@PostMapping("/visits/pharma")
	@ResponseStatus(code = HttpStatus.OK)
	public PharmaVisitModel addPharmaVisit(@RequestBody PharmaVisitModel pharmaVisit) {
		return service.addPharmaVisit(pharmaVisit);
	}
	
	@PutMapping("/visits/pharma")
	@ResponseStatus(code = HttpStatus.OK)
	public PharmaVisitModel updatePharmaVisit(@RequestBody PharmaVisitModel pharmaVisit) {
		return service.updatePharmaVisit(pharmaVisit);
	}
	
//	@GetMapping("/visits/pharma/employee/{employeeId}")
//	@ResponseStatus(code = HttpStatus.OK)
//	public List<PharmaModel> getAllPharmaVisitsByEmployee(String employeeId) {
//	
//		return service.getAllPharmaVisitsByEmployee(employeeId);
//	}
	
	@GetMapping("/visits/pharma/dependent/{dependentId}")
	@ResponseStatus(code = HttpStatus.OK)
	public List<PharmaVisitModel> getAllPharmaVisitsByDependent(String dependentId) {
	
		return service.getAllPharmaVisitsByDependent(dependentId);
	}

}
