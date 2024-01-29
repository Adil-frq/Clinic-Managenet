package com.nps.ClinicManagenet.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Data
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prescriptionId;
    private String medication;
    private String Dosage;
    @ManyToOne
    private Patient patientPrescription;
    @ManyToOne
    private Doctor doctorPrescription;
     @ManyToMany
    private List<Inventory> inventories;
}