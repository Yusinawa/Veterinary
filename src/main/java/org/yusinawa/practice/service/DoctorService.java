package org.yusinawa.practice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.DoctorDTO;
import org.yusinawa.practice.entity.Doctor;
import org.yusinawa.practice.repository.DoctorRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;

    public Doctor readById(Long id){
        return doctorRepository.findById(id).orElseThrow(() -> new RuntimeException("Doctor not found - " + id));
    }

    public Doctor create(DoctorDTO dto){
        return doctorRepository.save(Doctor.builder()
                .firstName(dto.firstName())
                .surname(dto.surname())
                .phone(dto.phone())
                .login(dto.login())
                .password(dto.password())
                .build());
    }

    public List<Doctor> readAll(){
        return doctorRepository.findAll();
    }
    public Doctor update(Doctor doctor){
        return doctorRepository.save(doctor);
    }
    public void delete(Long id){
        doctorRepository.deleteById(id);
    }
}
