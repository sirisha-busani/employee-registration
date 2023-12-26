package com.snipe.insurancemonster.client.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.snipe.insurancemonster.client.domain.DependentDomain;

@Repository
public interface DependentRepository extends JpaRepository<DependentDomain, String> {

	@Query(value="select * from dependent where employee_id= ?1", nativeQuery = true)
	List<DependentDomain> findByEmployeeId(String employeeId);

}
