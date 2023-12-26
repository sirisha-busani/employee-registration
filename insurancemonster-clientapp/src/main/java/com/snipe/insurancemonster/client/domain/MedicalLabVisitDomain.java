package com.snipe.insurancemonster.client.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="medical_lab_visit")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalLabVisitDomain implements Serializable {

	private static final long serialVersionUID = -8094649613620136951L;

	@Id
	@Column(name="id", columnDefinition = "CHAR(36)")
	String id;

}
