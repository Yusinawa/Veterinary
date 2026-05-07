package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yusinawa.practice.dto.VetServiceDTO;
import org.yusinawa.practice.entity.VetService;
import org.yusinawa.practice.service.VetServicesService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/service")
public class VetServiceController {
    private final VetServicesService vetServicesService;

    @GetMapping
    public ResponseEntity<List<VetService>> readAll(){
        return new ResponseEntity<>(vetServicesService.readAll(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public VetService getServiceById(@PathVariable Long id){
        return vetServicesService.readById(id);
    }
}
