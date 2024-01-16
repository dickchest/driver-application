package com.driverapp.service;

import com.driverapp.dto.DriverDto;
import com.driverapp.entity.Driver;
import com.driverapp.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DriverService {
    private final DriverRepository repository;

    public Driver save (DriverDto driverDto) {
        Driver driver = new Driver()
                .setName(driverDto.getName())
                .setBirthDay(driverDto.getBirthDay())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());

        return repository.save(driver);
    }

    public Iterable<Driver> getAll() {
        return repository.findAll();
    }
}
