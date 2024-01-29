package com.nps.ClinicManagenet.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Data
@Table(name ="appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="appointment_id")
    private int appointmentId;
    @ManyToOne
    @JsonBackReference
    private Patient patientAppointment;
    @ManyToOne
    private Doctor doctorAppointment;;
    private LocalDate date;
    private LocalTime time;



}
