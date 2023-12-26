package com.snipe.insurancemonster.auth.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.snipe.insurancemonster.auth.constants.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="document")
public class DocumentDomain implements Serializable {

	private static final long serialVersionUID = 2589899671956431314L;
	
	@Id
	@Column(name="id", columnDefinition = "CHAR(36)")
	String id;
	
	String name;
	
	@JoinColumn(referencedColumnName = "id")
	@ManyToOne
	DocumentMasterDomain docType;
	
	String path;
	
	String remarks;
	
	@Column(name="is_active", columnDefinition = "BIT")
	Boolean isActive;
	
	String createdBy;
	LocalDate createdDate;
	String modifiedBy;
	LocalDate modifiedDate;

}
