package com.nps.ClinicManagenet.controller;

import com.nps.ClinicManagenet.model.Appointment;
import com.nps.ClinicManagenet.model.Patient;
import com.nps.ClinicManagenet.service.PatientService;
import org.apache.catalina.startup.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/patients")
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping
    public Patient savePatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }
     @PostMapping("/{patientId}")
    public Patient bookAppointment(@PathVariable int patientId, @RequestBody Appointment appointment) {
       return patientService.bookAppointment(patientId, appointment);
    }
}
