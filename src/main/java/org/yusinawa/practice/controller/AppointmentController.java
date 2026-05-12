package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yusinawa.practice.dto.AppointmentDTO;
import org.yusinawa.practice.entity.Appointment;
import org.yusinawa.practice.service.AppointmentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/appointment")
public class AppointmentController {
    private final AppointmentService appointmentService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Appointment create(@RequestBody AppointmentDTO dto){
        return appointmentService.create(dto);
    }

    @GetMapping
    public ResponseEntity<List<Appointment>> getAll(){
        return new ResponseEntity<>(appointmentService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id){
        return appointmentService.getById(id);
    }

    @GetMapping("/doctor/{id}")
    public ResponseEntity<List<Appointment>> findByDoctorId(@PathVariable Long id){
        return new ResponseEntity<>(appointmentService.findByDoctorId(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Appointment> update(@RequestBody Appointment appointment){
        return new ResponseEntity<>(appointmentService.update(appointment), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        appointmentService.delete(id);
    }
}
