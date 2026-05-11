package org.yusinawa.practice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.entity.VetService;
import org.yusinawa.practice.repository.VetServiceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class VetServicesService {
    private final VetServiceRepository vetServiceRepository;

    public VetService getById(Long id){
        return vetServiceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service not found - " + id));
    }

    public List<VetService> readAll(){
        return vetServiceRepository.findAll();
    }

}
