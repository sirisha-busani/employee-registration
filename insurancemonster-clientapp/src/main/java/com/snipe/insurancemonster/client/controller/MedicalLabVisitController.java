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
import com.snipe.insurancemonster.client.service.MedicalLabVisitService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Medical Lab Visits", description = "Medical Labs visits management APIs")
public class MedicalLabVisitController {
	
	@Autowired
	MedicalLabVisitService service;
	
	
	@GetMapping("/visits/medicalLab/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public MedicalLabVisitModel getLabVisit(@PathVariable String id) {
		return service.getMedicalLabVisit(id);
	}
	
	
	@PostMapping("/visits/medicalLab")
	@ResponseStatus(code = HttpStatus.OK)
	public MedicalLabVisitModel addLabVisit(@RequestBody MedicalLabVisitModel labVisit) {
		return service.addLabVisit(labVisit);
	}
	
	@PutMapping("/visits/medicalLab")
	@ResponseStatus(code = HttpStatus.OK)
	public MedicalLabVisitModel updateLabVisit(@RequestBody MedicalLabVisitModel labVisit) {
		return service.updateLabVisit(labVisit);
	}
	
//	@GetMapping("/visits/medicalLab/employee/{employeeId}")
//	@ResponseStatus(code = HttpStatus.OK)
//	public List<MedicalLabModel> getAllLabVisitsByEmployee(String employeeId) {
//	
//		return service.getAllLabVisitsByEmployee(employeeId);
//	}
	
	@GetMapping("/visits/medicalLab/dependent/{dependentId}")
	@ResponseStatus(code = HttpStatus.OK)
	public List<MedicalLabVisitModel> getAllLabVisitsByDependent(String dependentId) {
	
		return service.getAllLabVisitsByDependent(dependentId);
	}
	

}
