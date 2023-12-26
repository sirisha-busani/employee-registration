package com.snipe.insurancemonster.client.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_details")
public class UserDetailsDomain implements UserDetails {

	private static final long serialVersionUID = -4283195890263761524L;

	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	@Column(name="id", columnDefinition = "CHAR(36)")
	String id;
	
	@Column(length = 50)
	String firstName;
	
	String lastName;
	
	String email;
	
	String mobileNumber;
	
	LocalDate dateOfBirth;
	
	@Enumerated(EnumType.STRING)
	Gender gender;
	
	String password;
	
	@JoinColumn(referencedColumnName="id")
	@OneToOne
	DocumentDomain profileImageDoc;
	
	String resetPassword;
	
	String resetPasswordOTP;
	
	@Column(name="reset_password_otp_generated_on")
	LocalDateTime otpDate;
	
	@Column(name="is_email_verified")
	Boolean emailVerified;
	
	String activationCode;
	
	@JoinColumn(referencedColumnName = "id")
	@ManyToOne
	RoleDomain role;
	
	@Column(name="is_active", columnDefinition = "BIT")
	Boolean isActive;
	
	String createdBy;
	
	LocalDateTime createdDate;
		
	LocalDateTime modifiedDate;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return List.of(new SimpleGrantedAuthority(role.getName()));
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
