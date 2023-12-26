package com.snipe.insurancemonster.client.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.snipe.insurancemonster.client.constants.IMonResponseConstants;
import com.snipe.insurancemonster.client.domain.AddressDomain;
import com.snipe.insurancemonster.client.domain.CorporateDomain;
import com.snipe.insurancemonster.client.domain.DepartmentMasterDomain;
import com.snipe.insurancemonster.client.domain.DesignationMasterDomain;
import com.snipe.insurancemonster.client.domain.EmployeeDomain;
import com.snipe.insurancemonster.client.domain.RoleDomain;
import com.snipe.insurancemonster.client.domain.UserDetailsDomain;
import com.snipe.insurancemonster.client.mapper.EmployeeMapper;
import com.snipe.insurancemonster.client.model.EmployeeModel;
import com.snipe.insurancemonster.client.repository.EmployeeRepository;
import com.snipe.insurancemonster.client.repository.UserRepository;
import com.snipe.insurancemonster.client.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	UserRepository userRepository;
		
	@Autowired
	EmployeeMapper mapper;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public EmployeeModel getEmployee(String id) {
		EmployeeModel empModel = new EmployeeModel();
		EmployeeDomain empDomain = employeeRepository.findById(id).get();
	
		return empModel;
	}


	public List<EmployeeModel> getAllEmployees() {
		// TODO Auto-generated method stub
		
		List<EmployeeDomain> employeeDomainList = employeeRepository.findAll();
		List<EmployeeModel> employeeModelList = new ArrayList<EmployeeModel>();
		
	
		
		return employeeModelList;
	}


	public String registerEmployee(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
//		EmployeeDomain employeeDomain = mapper.entity(employeeModel);		
//		UserDetailsDomain userDomain = new UserDetailsDomain();
//		
//		System.out.println("Email is " + employeeDomain.getUser().getFirstName());
//		
//		;
		
		EmployeeDomain employeeDomain = new EmployeeDomain();		
//		UserDetailsDomain userDomain = new UserDetailsDomain();
//		
//		BeanUtils.copyProperties(employeeModel, userDomain);
//		userDomain.setCreatedDate(LocalDateTime.now());
//		userDomain.setPassword(passwordEncoder.encode("password"));
//		RoleDomain role = new RoleDomain();
//		role.setId(4);
//		userDomain.setRole(role);
//		UserDetailsDomain user = userRepository.save(userDomain);
		
//		employeeDomain.setUser(user);
		UserDetailsDomain user = new UserDetailsDomain();
		user.setId(employeeModel.getId());
		employeeDomain.setUser(user);
		CorporateDomain corporate = new CorporateDomain();
		corporate.setId(employeeModel.getCorporateCompanyId());
		employeeDomain.setCorporateCompany(corporate);
		
		AddressDomain address = new AddressDomain();
		address.setAreaId(1);
		address.setCityId(1);
		address.setStateId(1);
		
//		BeanUtils.copyProperties(employeeModel.getAddress(),address);
		
		employeeDomain.setAddress(address);
	
		
		DepartmentMasterDomain department = new DepartmentMasterDomain();
		department.setId(employeeModel.getDepartment());
		employeeDomain.setDepartment(department);
		DesignationMasterDomain designation = new DesignationMasterDomain();
		designation.setId(employeeModel.getDesignation());
		employeeDomain.setDesignation(designation);
		BeanUtils.copyProperties(employeeModel, employeeDomain);
		System.out.println("employeedomain is " + employeeDomain);
	//	employeeRepository.save(employeeDomain);
		
		return IMonResponseConstants.EMPLOYEE_REGISTRATION_SUCCESS;
		
	}
	
	public void updateEmployee(EmployeeModel employeeModel) {
	
	}
}
