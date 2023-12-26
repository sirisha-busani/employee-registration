package com.snipe.insurancemonster.client.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="address")
public class AddressDomain implements Serializable {
	
	private static final long serialVersionUID = 3441056098641067071L;
	
	@Id
	@Column(name="id", columnDefinition = "CHAR(36)")
	@GeneratedValue(strategy = GenerationType.UUID)
	String id;
	String streetDetail;
	int areaId;
	int cityId;
	int stateId;

}
