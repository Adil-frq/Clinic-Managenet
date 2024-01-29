package com.nps.ClinicManagenet.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private int doctorId;
    private String name;
    private String specialization;
    private String contact;
    @OneToMany(mappedBy = "doctorAppointment")
    private List<Appointment> appointments;
    @OneToMany(mappedBy = "doctorPrescription")
    private List<Prescription> prescriptions;

}
