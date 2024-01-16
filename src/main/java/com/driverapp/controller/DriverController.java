package com.driverapp.controller;

import com.driverapp.dto.DriverDto;
import com.driverapp.entity.Driver;
import com.driverapp.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drivers")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService service;

    @PostMapping
    public Driver save (@RequestBody DriverDto driver) {
        return service.save(driver);
    }

    @GetMapping
    public Iterable<Driver> getAll() {
        return service.getAll();
    }
}
