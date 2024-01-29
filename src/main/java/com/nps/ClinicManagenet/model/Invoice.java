package com.nps.ClinicManagenet.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data

public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invoiceId;
    private double amount;
    private LocalDate date;
    @ManyToOne
    private Patient patientInvoice;

}
