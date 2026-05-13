package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yusinawa.practice.dto.PetTypeDTO;
import org.yusinawa.practice.service.PetTypeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pet_type")
public class PetTypeController {
    private final PetTypeService petTypeService;

    @GetMapping
    public List<PetTypeDTO> getAll(){
        return petTypeService.getAll();
    }

    @GetMapping("/{title}")
    public PetTypeDTO getByTitle(@PathVariable String title){
        return petTypeService.getById(title);
    }
}
