package com.example.hospital_management_system.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class AuthRequest {
    private String email;
    private String password;
}
