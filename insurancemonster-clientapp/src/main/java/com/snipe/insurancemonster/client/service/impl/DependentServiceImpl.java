package com.snipe.insurancemonster.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snipe.insurancemonster.client.constants.IMonResponseConstants;
import com.snipe.insurancemonster.client.domain.DependentDomain;
import com.snipe.insurancemonster.client.mapper.DependentMapper;
import com.snipe.insurancemonster.client.model.DependentModel;
import com.snipe.insurancemonster.client.repository.DependentRepository;
import com.snipe.insurancemonster.client.service.DependentService;

@Service
public class DependentServiceImpl implements DependentService {

	@Autowired
	DependentRepository repository;
	
	@Autowired
	DependentMapper mapper;

	public List<DependentModel> getDependents(String employeeId) {
		// TODO Auto-generated method stub
		List<DependentDomain>  domainList = repository.findByEmployeeId(employeeId);
		return mapper.modelList(domainList);
	}

	public List<DependentModel> getAllDependents() {
		// TODO Auto-generated method stub
		return null;
	}

	public String addDependent(DependentModel dependentModel) {
		// TODO Auto-generated method stub
		DependentDomain domain = mapper.entity(dependentModel);
		
		repository.save(domain);
		
		return IMonResponseConstants.DEPENDENT_REGISTRATION_SUCCESS;
		
		
	}

	public String updateDependent(DependentModel dependentModel) {
		// TODO Auto-generated method stub
		DependentDomain domain = mapper.entity(dependentModel);
		repository.save(domain);
		
		return IMonResponseConstants.DEPENDENT_UPDATE_SUCCESS;
		
	}

	public DependentModel deleteDependent(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public DependentModel getDependentDetails(String dependentId) {
		// TODO Auto-generated method stub
		DependentDomain domain = repository.findById(dependentId).get();
		return mapper.model(domain);
	}
}
