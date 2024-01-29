package com.nps.ClinicManagenet.repository;

import com.nps.ClinicManagenet.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
}
