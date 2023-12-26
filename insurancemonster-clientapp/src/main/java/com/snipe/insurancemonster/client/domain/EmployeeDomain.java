package com.snipe.insurancemonster.client.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.Cascade;

import com.snipe.insurancemonster.client.constants.BloodGroup;

import jakarta.persistence.CascadeType;
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
@Table(name="employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDomain implements Serializable{

	private static final long serialVersionUID = 3204517815819503896L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)	
	@Column(name="id", columnDefinition = "CHAR(36)")
	String id;
	
	@Column(name="employee_id")
	String employeeId;
	
	@Column(name="aadhar_number")
	String aadharNumber;
	
	@Column(name="pan_number")
	String panNumber;
	
	float height;
	
	float weight;
	
	@Column(name="blood_group")
	BloodGroup bloodGroup;
	
	@Column(name="date_of_joining")
	LocalDate dateOfJoining;
	
	@JoinColumn(referencedColumnName = "id")
	@ManyToOne
	CorporateDomain corporateCompany;
	
	@JoinColumn(referencedColumnName = "id")
	@ManyToOne
	InsuranceDomain insuranceCompany;
	
	@JoinColumn(referencedColumnName = "id")
	@ManyToOne	
	DepartmentMasterDomain department; 
	
	@JoinColumn(referencedColumnName = "id")
	@ManyToOne
	DesignationMasterDomain designation;
	
	@Column(name="is_active", columnDefinition = "BIT")
	Boolean isActive;
	
	@JoinColumn(referencedColumnName = "id")
	@OneToOne
	UserDetailsDomain user;
	
	@Column(name="approved_by", columnDefinition = "BIT")
	Boolean approvedBy;
	
	@JoinColumn(referencedColumnName = "id")
	@OneToOne(cascade = CascadeType.ALL)
	AddressDomain address;
	

}
