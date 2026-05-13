package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.DoctorDTO;
import org.yusinawa.practice.entity.Doctor;
import org.yusinawa.practice.repository.DoctorRepository;
import org.yusinawa.practice.service.DoctorService;

import java.util.List;

@Service
@AllArgsConstructor
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;

    @Override
    public Doctor getById(Long id){
        return doctorRepository.findById(id).orElseThrow(() -> new RuntimeException("Doctor not found - " + id));
    }

    @Override
    public Doctor create(DoctorDTO dto){
        return doctorRepository.save(Doctor.builder()
                .firstName(dto.firstName())
                .surname(dto.surname())
                .phone(dto.phone())
                .login(dto.login())
                .password(dto.password())
                .build());
    }

    @Override
    public List<Doctor> getAll(){
        return doctorRepository.findAll();
    }

    @Override
    public Doctor update(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    @Override
    public void delete(Long id){
        doctorRepository.deleteById(id);
    }
}
