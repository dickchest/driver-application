package com.driverapp.entity;

import com.driverapp.repository.DriverRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Accessors(chain = true)
public class Driver {

    @Id
    private String id;
    private String name;
    private LocalDate birthDay;
    private LocalDateTime createdAt;
}
