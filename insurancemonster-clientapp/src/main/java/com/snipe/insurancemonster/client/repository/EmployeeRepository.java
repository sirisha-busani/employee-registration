package com.snipe.insurancemonster.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snipe.insurancemonster.client.domain.EmployeeDomain;
import com.snipe.insurancemonster.client.model.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDomain, String> {

}
