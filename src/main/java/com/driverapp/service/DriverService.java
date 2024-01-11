package com.driverapp.service;

import com.driverapp.dto.DriverDto;
import com.driverapp.entity.Driver;
import com.driverapp.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverService {
    private final DriverRepository repository;

    public Driver save (DriverDto driverDto) {
        String name = driverDto.getName();
    }

    public Iterable<Driver> getAll() {

    }
}
