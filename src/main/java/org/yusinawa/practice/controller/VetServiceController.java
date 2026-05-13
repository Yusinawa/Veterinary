package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.yusinawa.practice.dto.VetServiceDTO;
import org.yusinawa.practice.service.VetServicesService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/service")
public class VetServiceController {
    private final VetServicesService vetServicesService;

    @GetMapping
    public List<VetServiceDTO> getAll(){
        return vetServicesService.getAll();
    }

    @GetMapping("/{id}")
    public VetServiceDTO getServiceById(@PathVariable Long id){
        return vetServicesService.getById(id);
    }
}
