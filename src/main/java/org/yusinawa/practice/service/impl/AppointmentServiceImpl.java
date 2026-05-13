package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.AppointmentDTO;
import org.yusinawa.practice.entity.Appointment;
import org.yusinawa.practice.repository.AppointmentRepository;
import org.yusinawa.practice.service.*;

import java.util.List;

@Service
@AllArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorService doctorService;
    private final VetServicesService vetServicesService;
    private final CustomerService customerService;

    @Override
    public Appointment getById(Long id){
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found - " + id));
    }

    @Override
    public Appointment create(AppointmentDTO dto){
        return appointmentRepository.save(Appointment.builder()
                .date(dto.date())
                .status(dto.status())
                .doctor(doctorService.getById(dto.doctor()))
                .service(vetServicesService.getById(dto.service()))
                .customer(customerService.getById(dto.customer()))
                .build());
    }

    @Override
    public List<Appointment> getAll(){
        return appointmentRepository.findAll();
    }

    @Override
    public List<Appointment> findByDoctorId(Long id){
        return appointmentRepository.findByDoctorId(id);
    }

    @Override
    public Appointment update(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    @Override
    public void delete(Long id){
        appointmentRepository.deleteById(id);
    }
}
