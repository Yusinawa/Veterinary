package org.yusinawa.practice.service;

import org.yusinawa.practice.dto.AppointmentDTO;
import org.yusinawa.practice.entity.Appointment;

import java.util.List;

public interface AppointmentService {
    Appointment getById(Long id);
    Appointment create(AppointmentDTO dto);
    List<Appointment> getAll();
    List<Appointment> findByDoctorId(Long id);
    Appointment update(Appointment appointment);
    void delete(Long id);
}
