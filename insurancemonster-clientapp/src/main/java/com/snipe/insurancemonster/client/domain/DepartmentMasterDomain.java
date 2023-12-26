package com.snipe.insurancemonster.client.domain;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="department_master")
public class DepartmentMasterDomain implements Serializable{

	private static final long serialVersionUID = 8268794340487320337L;
	
	@Id
	int id;
	String name;
	@Column(name="is_active", columnDefinition = "BIT")
	Boolean isActive;
	String createdBy;
	LocalDate createdDate;
	String modifiedBy;
	LocalDate modifiedDate;

}
