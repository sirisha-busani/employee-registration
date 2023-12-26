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
@Table(name="designation_master")
public class DesignationMasterDomain implements Serializable {

	private static final long serialVersionUID = 4294522726745449019L;
	
	@Id
	int id;
	String name;
	@Column(name="is_active", columnDefinition = "BIT")
	Boolean isActive;
	LocalDate createdDate;
	LocalDate modifiedDate;

}
