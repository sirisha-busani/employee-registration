package com.snipe.insurancemonster.client.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="hospital_visit")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalVisitDomain implements Serializable{

	private static final long serialVersionUID = 3732252683102575478L;
	@Id
	@Column(name="id", columnDefinition = "CHAR(36)")
	String id;
	
	@JoinColumn(referencedColumnName="id")
	@ManyToOne
	EmployeeDomain employee;
	
	
	@JoinColumn(referencedColumnName="id")
	@ManyToOne
	DependentDomain dependent;
	
	
	
	
	
}
