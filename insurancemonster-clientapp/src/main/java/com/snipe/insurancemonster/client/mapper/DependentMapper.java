package com.snipe.insurancemonster.client.mapper;

import org.springframework.stereotype.Component;

import com.snipe.insurancemonster.client.domain.DependentDomain;
import com.snipe.insurancemonster.client.model.DependentModel;

@Component
public class DependentMapper extends AbstractModelMapper<DependentDomain, DependentModel> {

	@Override
	public Class<DependentDomain> entityType() {
		// TODO Auto-generated method stub
		return DependentDomain.class;
	}

	@Override
	public Class<DependentModel> modelType() {
		// TODO Auto-generated method stub
		return DependentModel.class;
	}

}
