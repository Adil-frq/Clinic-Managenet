package com.nps.ClinicManagenet.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;
    private String itemName;
    private int quantity;
    private double price;
    @ManyToMany(mappedBy = "inventories")
    private List<Prescription> prescriptions;
}