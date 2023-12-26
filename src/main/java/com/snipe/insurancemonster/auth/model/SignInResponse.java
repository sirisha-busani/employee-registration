package com.snipe.insurancemonster.auth.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignInResponse implements Serializable{

	private static final long serialVersionUID = 2918834495150036632L;
	
	String token;

}
