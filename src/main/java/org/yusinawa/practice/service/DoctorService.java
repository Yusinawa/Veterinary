package org.yusinawa.practice.service;

import org.yusinawa.practice.dto.DoctorDTO;

import java.util.List;

public interface DoctorService {
    DoctorDTO getById(Long id);
    DoctorDTO create(DoctorDTO dto);
    List<DoctorDTO> getAll();
    DoctorDTO update(DoctorDTO dto);
    void delete(Long id);
}
