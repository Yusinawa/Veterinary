package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.DoctorDTO;
import org.yusinawa.practice.entity.Doctor;
import org.yusinawa.practice.mapper.DoctorMapper;
import org.yusinawa.practice.repository.DoctorRepository;
import org.yusinawa.practice.service.DoctorService;

import java.util.List;

@Service
@AllArgsConstructor
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    @Override
    public DoctorDTO getById(Long id){
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found - " + id));
        return doctorMapper.toDTO(doctor);
    }

    @Override
    public DoctorDTO create(DoctorDTO dto){
        Doctor doctor = doctorMapper.toEntity(dto);
        Doctor savedDoctor = doctorRepository.save(doctor);
        return doctorMapper.toDTO(savedDoctor);
    }

    @Override
    public List<DoctorDTO> getAll(){
        List<Doctor> doctors = doctorRepository.findAll();
        return doctorMapper.toDTOList(doctors);
    }

    @Override
    public DoctorDTO update(DoctorDTO dto){
        Doctor doctor = doctorMapper.toEntity(dto);
        Doctor updatedDoctor = doctorRepository.save(doctor);
        return doctorMapper.toDTO(updatedDoctor);
    }

    @Override
    public void delete(Long id){
        doctorRepository.deleteById(id);
    }
}
