package com.nps.ClinicManagenet.service;

import com.nps.ClinicManagenet.model.Appointment;
import com.nps.ClinicManagenet.model.Patient;

public interface PatientService {

    public Patient savePatient(Patient patient);

    public Patient bookAppointment(int id, Appointment appointment);
}
