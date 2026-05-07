package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yusinawa.practice.entity.PetType;
import org.yusinawa.practice.repository.PetTypeRepository;
import org.yusinawa.practice.service.PetTypeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pet_type")
public class PetTypeController {
    private final PetTypeService petTypeService;

    @GetMapping
    public ResponseEntity<List<PetType>> readAll(){
        return new ResponseEntity<>(petTypeService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/{title}")
    public PetType getByTitle(@PathVariable String title){
        return petTypeService.readByTitle(title);
    }
}
