package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.yusinawa.practice.dto.AppointmentDTO;
import org.yusinawa.practice.service.AppointmentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/appointment")
public class AppointmentController {
    private final AppointmentService appointmentService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public AppointmentDTO create(@RequestBody AppointmentDTO dto){
        return appointmentService.create(dto);
    }

    @GetMapping
    public List<AppointmentDTO> getAll(){
        return appointmentService.getAll();
    }

    @GetMapping("/{id}")
    public AppointmentDTO getAppointmentById(@PathVariable Long id){
        return appointmentService.getById(id);
    }

    @GetMapping("/doctor/{id}")
    public List<AppointmentDTO> findByDoctorId(@PathVariable Long id){
        return appointmentService.findByDoctorId(id);
    }

    @PutMapping
    public AppointmentDTO update(@RequestBody AppointmentDTO dto){
        return appointmentService.update(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        appointmentService.delete(id);
    }
}
