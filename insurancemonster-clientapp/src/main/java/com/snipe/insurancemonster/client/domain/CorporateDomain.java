package com.snipe.insurancemonster.client.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="corporate_company")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorporateDomain implements Serializable {
	
	private static final long serialVersionUID = -5753456931061654850L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)	
	@Column(name="id", columnDefinition = "CHAR(36)")
	String id;
	
	String name;
	
	String registrationNumber;
	
	String phone;
	String email;
	String website;
	String gstNumber;
	String companyDescription;
	String authorisedPerson;
	
	@JoinColumn(referencedColumnName = "id", name = "logo_doc_id")
	@OneToOne
	DocumentDomain logoDoc;
	
	@JoinColumn(referencedColumnName = "id", name = "registration_doc_id")
	@OneToOne
	DocumentDomain registrationDoc;
	
	@JoinColumn(referencedColumnName = "id")
	@OneToOne
	AddressDomain address;
	
	@Column(name="is_active", columnDefinition = "BIT")
	Boolean isActive;
	
	@JoinColumn(referencedColumnName = "id", name = "created_by")
	@ManyToOne
	UserDetailsDomain createdby;
	
	@Column(name="created_date")
	String createddate;
	
	@JoinColumn(referencedColumnName = "id", name = "modified_by")
	@ManyToOne
	UserDetailsDomain modifiedBy;
	
	@Column(name="modified_date")
	String modifieddate;
	
	

}
