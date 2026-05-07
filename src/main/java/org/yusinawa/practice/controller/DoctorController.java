package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yusinawa.practice.dto.DoctorDTO;
import org.yusinawa.practice.entity.Doctor;
import org.yusinawa.practice.repository.DoctorRepository;
import org.yusinawa.practice.service.DoctorService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/doctor")
public class DoctorController {
    private final DoctorService doctorService;

    @PostMapping
    public ResponseEntity<Doctor> create(@RequestBody DoctorDTO dto){
        return new ResponseEntity<>(doctorService.create(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Doctor>> readAll(){
        return new ResponseEntity<>(doctorService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id){
        return doctorService.readById(id);
    }

    @PutMapping
    public ResponseEntity<Doctor> update(@RequestBody Doctor doctor){
        return new ResponseEntity<>(doctorService.update(doctor),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id){
        doctorService.delete(id);
        return HttpStatus.OK;
    }
}
