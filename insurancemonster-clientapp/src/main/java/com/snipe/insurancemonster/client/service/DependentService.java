package com.snipe.insurancemonster.client.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snipe.insurancemonster.client.domain.DependentDomain;
import com.snipe.insurancemonster.client.domain.EmployeeDomain;
import com.snipe.insurancemonster.client.mapper.DependentMapper;
import com.snipe.insurancemonster.client.model.DependentModel;
import com.snipe.insurancemonster.client.repository.DependentRepository;

public interface DependentService {
	
	public List<DependentModel> getDependents(String employeeId);
	
	public List<DependentModel> getAllDependents() ;
	
	public String addDependent(DependentModel dependentModel);
	
	public String updateDependent(DependentModel dependentModel);
	
	public DependentModel deleteDependent(String id);
	
	public DependentModel getDependentDetails(String dependentId);

}
