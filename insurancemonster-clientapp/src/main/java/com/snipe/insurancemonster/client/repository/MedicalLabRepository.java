package com.snipe.insurancemonster.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snipe.insurancemonster.client.domain.MedicalLabVisitDomain;

@Repository
public interface MedicalLabRepository extends JpaRepository<MedicalLabVisitDomain, String> {


}
