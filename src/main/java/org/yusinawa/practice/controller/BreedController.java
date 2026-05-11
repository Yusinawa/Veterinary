package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yusinawa.practice.entity.Breed;
import org.yusinawa.practice.service.BreedService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/breed")
public class BreedController {
    private final BreedService breedService;

    @GetMapping
    public ResponseEntity<List<Breed>> readAll(){
        return new ResponseEntity<>(breedService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/{title}")
    public Breed getByTitle(@PathVariable String title){
        return breedService.getById(title);
    }
}
