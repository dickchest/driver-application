package com.driverapp.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DriverDto {
    private String name;
    private LocalDate birthDay;
}
