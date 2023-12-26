package com.snipe.insurancemonster.auth.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snipe.insurancemonster.auth.domain.UserDetailsDomain;


@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetailsDomain, String> {

	Optional<UserDetailsDomain>  findByEmail(String username);
	

}
