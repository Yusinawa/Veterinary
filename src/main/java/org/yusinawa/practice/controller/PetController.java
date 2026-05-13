package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yusinawa.practice.dto.PetDTO;
import org.yusinawa.practice.entity.Pet;
import org.yusinawa.practice.service.PetService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pet")
public class PetController {
    private final PetService petService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Pet create(@RequestBody PetDTO dto){
        return petService.create(dto);
    }

    @GetMapping
    public ResponseEntity<List<Pet>> getAll(){
        return new ResponseEntity<>(petService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Pet getPetById(@PathVariable Long id){
        return petService.getById(id);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<List<Pet>> findByCustomerId(@PathVariable Long id){
        return new ResponseEntity<>(petService.findByCustomerId(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Pet> update(@RequestBody Pet pet){
        return new ResponseEntity<>(petService.update(pet), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        petService.delete(id);
    }
}
