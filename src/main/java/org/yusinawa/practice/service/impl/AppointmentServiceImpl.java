package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.AppointmentDTO;
import org.yusinawa.practice.entity.Appointment;
import org.yusinawa.practice.mapper.AppointmentMapper;
import org.yusinawa.practice.repository.AppointmentRepository;
import org.yusinawa.practice.service.*;

import java.util.List;

@Service
@AllArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final AppointmentMapper appointmentMapper;

    @Override
    public AppointmentDTO getById(Long id){
        Appointment appointment = appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found - " + id));
        return appointmentMapper.toDTO(appointment);
    }

    @Override
    public AppointmentDTO create(AppointmentDTO dto){
        Appointment appointment = appointmentMapper.toEntity(dto);
        Appointment savedAppointment = appointmentRepository.save(appointment);
        return appointmentMapper.toDTO(savedAppointment);
    }

    @Override
    public List<AppointmentDTO> getAll(){
        List<Appointment> appointments = appointmentRepository.findAll();
        return appointmentMapper.toDTOList(appointments);
    }

    @Override
    public List<AppointmentDTO> findByDoctorId(Long id){
        List<Appointment> appointments = appointmentRepository.findByDoctorId(id);
        return appointmentMapper.toDTOList(appointments);
    }

    @Override
    public AppointmentDTO update(AppointmentDTO dto){
        Appointment appointment = appointmentMapper.toEntity(dto);
        Appointment updatedAppointment = appointmentRepository.save(appointment);
        return appointmentMapper.toDTO(updatedAppointment);
    }

    @Override
    public void delete(Long id){
        appointmentRepository.deleteById(id);
    }
}
