package com.snipe.insurancemonster.client.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.snipe.insurancemonster.client.constants.BloodGroup;
import com.snipe.insurancemonster.client.constants.Gender;
import com.snipe.insurancemonster.client.constants.Relation;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DependentModel implements Serializable {

	private static final long serialVersionUID = -1893493933088777660L;
	
	String id;
	String employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	LocalDate dateOfBirth;
	
	
	@Enumerated(EnumType.STRING)
	Relation relationship;
	
	@Enumerated(EnumType.STRING)
	Gender gender;
	
	@Enumerated(EnumType.STRING)
	BloodGroup bloodGroup;
	

	float height;
	float weight;
	
	String aadharNumber;
	
	String profilePicDocId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Relation getRelationship() {
		return relationship;
	}

	public void setRelationship(Relation relationship) {
		this.relationship = relationship;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getProfilePicDocId() {
		return profilePicDocId;
	}

	public void setProfilePicDocId(String profilePicDocId) {
		this.profilePicDocId = profilePicDocId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
