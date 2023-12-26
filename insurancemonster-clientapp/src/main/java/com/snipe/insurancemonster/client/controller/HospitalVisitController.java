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
import com.snipe.insurancemonster.client.service.HospitalVisitService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Hospital Visits", description = "Hospital visit management APIs")
public class HospitalVisitController {
	
	@Autowired
	HospitalVisitService service;
	
	
	@GetMapping("/visits/hospital/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public HospitalVisitModel getHospitalVisit(@PathVariable String id) {
		return service.getHospitalVisit(id);
	}
	
	
	@PostMapping("/visits/hospital")
	@ResponseStatus(code = HttpStatus.OK)
	public HospitalVisitModel addHsopitalVisit(@RequestBody HospitalVisitModel labVisit) {
		return service.addHospitalVisit(labVisit);
	}
	
	@PutMapping("/visits/hospital")
	@ResponseStatus(code = HttpStatus.OK)
	public HospitalVisitModel updateHospitalVisit(@RequestBody HospitalVisitModel labVisit) {
		return service.updateHospitalVisit(labVisit);
	}
	
//	@GetMapping("/visits/hospital/employee/{employeeId}")
//	@ResponseStatus(code = HttpStatus.OK)
//	public List<HospitalModel> getAllHospitalVisitsByEmployee(String employeeId) {
//	
//		return service.getAllHospitalVisitsByEmployee(employeeId);
//	}
	
	@GetMapping("/visits/hospital/dependent/{dependentId}")
	@ResponseStatus(code = HttpStatus.OK)
	public List<HospitalVisitModel> getAllHospitalVisitsByDependent(String dependentId) {
	
		return service.getAllHospitalVisitsByDependent(dependentId);
	}

}
