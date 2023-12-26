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
@Table(name="pharmacy_visit")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PharmaVisitDomain implements Serializable {

	private static final long serialVersionUID = -4390796254147467602L;
	
	@Id
	@Column(name="id", columnDefinition = "CHAR(36)")
	String id;

}
