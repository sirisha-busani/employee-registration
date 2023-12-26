package com.snipe.insurancemonster.client.service;

import java.util.List;

import com.snipe.insurancemonster.client.model.EmployeeModel;

public interface EmployeeService {
	
	public EmployeeModel getEmployee(String id) ;
	public String registerEmployee(EmployeeModel employeeModel);
	public List<EmployeeModel> getAllEmployees();
	public void updateEmployee(EmployeeModel employeeModel);

}
