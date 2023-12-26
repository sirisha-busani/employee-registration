package com.snipe.insurancemonster.auth.domain;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.annotations.Type;

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
@Table(name="role_master")
public class RoleDomain implements Serializable {

	private static final long serialVersionUID = -7608093365526071391L;
	
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
