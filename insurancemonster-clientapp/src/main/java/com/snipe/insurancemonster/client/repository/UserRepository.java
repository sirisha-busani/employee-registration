package com.snipe.insurancemonster.client.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snipe.insurancemonster.client.domain.UserDetailsDomain;


public interface UserRepository extends JpaRepository<UserDetailsDomain, String> {
	
	Optional<UserDetailsDomain>  findByEmail(String username);

}
