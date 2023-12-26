package com.snipe.insurancemonster.auth.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressModel implements Serializable {

	private static final long serialVersionUID = -4755456175807823473L;
	String id;
	String areaId;
}
