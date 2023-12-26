package com.snipe.insurancemonster.client.mapper;

import org.springframework.stereotype.Component;

import com.snipe.insurancemonster.client.domain.EmployeeDomain;
import com.snipe.insurancemonster.client.model.EmployeeModel;

@Component
public class EmployeeMapper extends AbstractModelMapper<EmployeeDomain, EmployeeModel> {

	@Override
	public Class<EmployeeDomain> entityType() {
		// TODO Auto-generated method stub
		return EmployeeDomain.class;
	}

	@Override
	public Class<EmployeeModel> modelType() {
		// TODO Auto-generated method stub
		return EmployeeModel.class;
	}


}
