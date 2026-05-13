package org.yusinawa.practice.service;

import org.yusinawa.practice.dto.AppointmentDTO;

import java.util.List;

public interface AppointmentService {
    AppointmentDTO getById(Long id);
    AppointmentDTO create(AppointmentDTO dto);
    List<AppointmentDTO> getAll();
    List<AppointmentDTO> findByDoctorId(Long id);
    AppointmentDTO update(AppointmentDTO dto);
    void delete(Long id);
}
