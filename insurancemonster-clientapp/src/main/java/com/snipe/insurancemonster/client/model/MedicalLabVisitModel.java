package com.snipe.insurancemonster.client.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class MedicalLabVisitModel implements Serializable {

	private static final long serialVersionUID = -3937560910727973063L;
	
	String dependentId;
	String employeeId;
	String labName;
	AddressModel address;
	float charges; 
	List<DocumentModel> documents;
	LocalDateTime visitDate;
	
	
	public String getDependentId() {
		return dependentId;
	}
	public void setDependentId(String dependentId) {
		this.dependentId = dependentId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getLabName() {
		return labName;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	public AddressModel getAddress() {
		return address;
	}
	public void setAddress(AddressModel address) {
		this.address = address;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public List<DocumentModel> getDocuments() {
		return documents;
	}
	public void setDocuments(List<DocumentModel> documents) {
		this.documents = documents;
	}
	public LocalDateTime getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(LocalDateTime visitDate) {
		this.visitDate = visitDate;
	}
	
	

}
