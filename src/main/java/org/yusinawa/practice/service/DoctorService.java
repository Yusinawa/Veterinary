package org.yusinawa.practice.service;

import org.yusinawa.practice.dto.DoctorDTO;
import org.yusinawa.practice.entity.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor getById(Long id);
    Doctor create(DoctorDTO dto);
    List<Doctor> getAll();
    Doctor update(Doctor doctor);
    void delete(Long id);
}
