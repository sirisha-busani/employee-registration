package com.snipe.insurancemonster.auth.model;

import java.io.Serializable;
import java.time.LocalDate;

import com.snipe.insurancemonster.auth.constants.BloodGroup;
import com.snipe.insurancemonster.auth.constants.Gender;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeModel implements Serializable {

	private static final long serialVersionUID = -7230579058723202687L;

	@Schema(accessMode = Schema.AccessMode.READ_ONLY)
	String id;
	
	String corporateCompanyId;
	
	String employeeId;
	
	String firstName;
	
	String lastName;
	
//	AddressModel address;
	
	TestModel test;
	
	@Email
	String email;
	
	String mobileNumber;
	
	LocalDate dateOfBirth;
	
	LocalDate dateOfJoining;	
		
	String aadharNumber;
	
	String panNumber;
	
	Gender gender;
	
	int designation;
	
	int department;
	
	float height;
	
	float weight;
		
	BloodGroup bloodGroup;
	
	String profileDocumentId;
		
	String createdBy;
	
	
}
