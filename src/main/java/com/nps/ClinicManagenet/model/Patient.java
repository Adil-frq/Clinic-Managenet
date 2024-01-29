package com.nps.ClinicManagenet.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int patientId;
    private String name;
    private int age;
    private String contact;
    @OneToMany(mappedBy = "patientAppointment")
    @JsonManagedReference
    private List<Appointment> appointments;
    @OneToMany(mappedBy = "patientPrescription")
    private List<Prescription> prescriptions;
    @OneToMany(mappedBy = "patientInvoice")
    private List<Invoice> invoices;
}
