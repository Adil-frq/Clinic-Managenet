package com.nps.ClinicManagenet.repository;

import com.nps.ClinicManagenet.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
}
