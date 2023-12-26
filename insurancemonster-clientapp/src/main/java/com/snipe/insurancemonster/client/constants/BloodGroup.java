package com.snipe.insurancemonster.client.constants;

public enum BloodGroup {
	A_PLUS("A+"),
	A_MINUS("A-"),
	B_PLUS("B+"),
	B_MINUS("B-"),
	O_PLUS("O+"),
	O_MINUS("O-"),
	AB_PLUS("AB+"),
	AB_MINUS("AB-");

	private String value;
	
	private BloodGroup(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
