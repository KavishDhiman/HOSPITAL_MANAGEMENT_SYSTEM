package com.example.hospital_management_system.service;

import com.example.hospital_management_system.entity.Patient;
import com.example.hospital_management_system.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    // Create
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Get All
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // Get by ID
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    // Delete
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}