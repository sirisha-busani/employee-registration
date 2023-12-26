package com.snipe.insurancemonster.client.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="area_master")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AreaDomain implements Serializable {

	private static final long serialVersionUID = 658703463923000595L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	CityDomain city;

	
	
}
