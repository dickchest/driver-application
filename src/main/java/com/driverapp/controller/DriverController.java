package com.driverapp.controller;

import com.driverapp.dto.DriverDto;
import com.driverapp.entity.Driver;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @PostMapping
    public Driver save (DriverDto driver) {
        return new Driver();
    }
}
