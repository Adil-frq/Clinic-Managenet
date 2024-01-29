package com.nps.ClinicManagenet.serviceImpl;

import com.nps.ClinicManagenet.model.Appointment;
import com.nps.ClinicManagenet.model.Patient;
import com.nps.ClinicManagenet.repository.AppointmentRepository;
import com.nps.ClinicManagenet.repository.PatientRepository;
import com.nps.ClinicManagenet.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientRepository patientRepository;
     @Autowired
    AppointmentRepository appointmentRepository;
    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient bookAppointment(int id, Appointment appointment) {
        Optional<Patient> patientById = patientRepository.findById(id);
        List<Appointment> appointments = null;
        Patient patient = null;
        if(patientById.isPresent()) {
            patient = patientById.get();
            appointments = patient.getAppointments();
        }
        //if Patient is not available for the given id then throw exception
        if(appointment != null)
            appointment.setPatientAppointment(patient);

        Appointment savedAppointment = appointmentRepository.save(appointment);


        appointments.add(savedAppointment);

        patient.setAppointments(appointments);
        patientRepository.save(patient);
        return patient;
    }
}
