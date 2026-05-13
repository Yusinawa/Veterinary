package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yusinawa.practice.dto.BreedDTO;
import org.yusinawa.practice.service.BreedService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/breed")
public class BreedController {
    private final BreedService breedService;

    @GetMapping
    public List<BreedDTO> getAll(){
        return breedService.getAll();
    }

    @GetMapping("/{title}")
    public BreedDTO getByTitle(@PathVariable String title){
        return breedService.getById(title);
    }
}
