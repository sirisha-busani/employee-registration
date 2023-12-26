package com.snipe.insurancemonster.client.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.snipe.insurancemonster.client.constants.BloodGroup;
import com.snipe.insurancemonster.client.constants.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name="dependent")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DependentDomain implements Serializable {
	
	private static final long serialVersionUID = 1446829000113739124L;
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="id", columnDefinition = "CHAR(36)")
	String id;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="relationship")
	String relationship;
	
	@Column(name="date_of_birth")
	LocalDateTime dateOfBirth;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender")
	Gender gender;
	
	@Column(name="aadhar_number")
	String aadharNumber;
	
	@Column(name="height")
	float height;
	
	@Column(name="weight")
	float weight;
	
	@Column(name="blood_group")
	BloodGroup bloodGroup;
	
	@ManyToOne
    @JoinColumn(name="employee_id", referencedColumnName = "id")
    EmployeeDomain employee;
	
	@ManyToOne
    @JoinColumn(name="approved_by", referencedColumnName = "id")
    UserDetailsDomain approvedBy;
	
	@Column(name="is_active")
	boolean isActive;
	
	@JoinColumn(referencedColumnName = "id", name = "created_by")
	@ManyToOne
	UserDetailsDomain createdby;
	
	@Column(name="created_date")
	String createddate;
	
	@JoinColumn(referencedColumnName = "id", name = "modified_by")
	@ManyToOne
	UserDetailsDomain modifiedBy;
	
	@Column(name="modified_date")
	LocalTime modifieddate;
	
}
