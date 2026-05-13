package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.yusinawa.practice.dto.PetDTO;
import org.yusinawa.practice.service.PetService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pet")
public class PetController {
    private final PetService petService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public PetDTO create(@RequestBody PetDTO dto){
        return petService.create(dto);
    }

    @GetMapping
    public List<PetDTO> getAll(){
        return petService.getAll();
    }

    @GetMapping("/{id}")
    public PetDTO getPetById(@PathVariable Long id){
        return petService.getById(id);
    }

    @GetMapping("/customer/{id}")
    public List<PetDTO> findByCustomerId(@PathVariable Long id){
        return petService.findByCustomerId(id);
    }

    @PutMapping
    public PetDTO update(@RequestBody PetDTO dto){
        return petService.update(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        petService.delete(id);
    }
}
