package org.yusinawa.practice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.AppointmentDTO;
import org.yusinawa.practice.entity.Appointment;
import org.yusinawa.practice.repository.AppointmentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorService doctorService;
    private final VetServicesService vetServicesService;
    private final CustomerService customerService;

    public Appointment getById(Long id){
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found - " + id));
    }

    public Appointment create(AppointmentDTO dto){
        return appointmentRepository.save(Appointment.builder()
                .date(dto.date())
                .status(dto.status())
                .doctor(doctorService.getById(dto.doctor()))
                .service(vetServicesService.getById(dto.service()))
                .customer(customerService.getById(dto.customer()))
                .build());
    }

    public List<Appointment> readAll(){
        return appointmentRepository.findAll();
    }

    public List<Appointment> findByDoctorId(Long id){
        return appointmentRepository.findByDoctorId(id);
    }

    public Appointment update(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    public void delete(Long id){
        appointmentRepository.deleteById(id);
    }
}
