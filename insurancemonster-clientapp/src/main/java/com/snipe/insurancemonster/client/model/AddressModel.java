package com.snipe.insurancemonster.client.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressModel implements Serializable{

	private static final long serialVersionUID = 2509628531907297492L;

	String id;
	String streetDetail;
	int areaId;
	String areaName;
	int cityId;
	String city;
	int stateId;
	String state;
	String pincode;
	
	
	
}
