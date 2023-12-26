package com.snipe.insurancemonster.auth.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.snipe.insurancemonster.auth.constants.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="document_type_master")

public class DocumentMasterDomain implements Serializable {

	private static final long serialVersionUID = -6982630263952424343L;
	
	@Id
	int id;
	
	String code;	
	
	@Column(name="is_active", columnDefinition = "BIT")
	Boolean isActive;
	
	String createdBy;
	LocalDate createdDate;
	String modifiedBy;
	LocalDate modifiedDate;
	

}
