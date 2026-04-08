package com.example.hospital_management_system.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientDto {
    private Long id;
    private String name;
    private int age;
    private String gender;
    private String disease;
    private String address;
    private String phoneNumber;
}
