package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.yusinawa.practice.dto.DoctorDTO;
import org.yusinawa.practice.service.DoctorService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/doctor")
public class DoctorController {
    private final DoctorService doctorService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public DoctorDTO create(@RequestBody DoctorDTO dto){
        return doctorService.create(dto);
    }

    @GetMapping
    public List<DoctorDTO> getAll(){
        return doctorService.getAll();
    }

    @GetMapping("/{id}")
    public DoctorDTO getDoctorById(@PathVariable Long id){
        return doctorService.getById(id);
    }

    @PutMapping
    public DoctorDTO update(@RequestBody DoctorDTO dto){
        return doctorService.update(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        doctorService.delete(id);
    }
}
