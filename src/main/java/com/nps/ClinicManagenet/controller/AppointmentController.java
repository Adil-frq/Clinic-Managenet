package com.nps.ClinicManagenet.controller;

import com.nps.ClinicManagenet.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

}
