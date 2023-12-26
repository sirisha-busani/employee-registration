package com.snipe.insurancemonster.auth.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TestModel implements Serializable{
	
	private static final long serialVersionUID = 5929987439032942281L;
	String id;
	String name;

}
