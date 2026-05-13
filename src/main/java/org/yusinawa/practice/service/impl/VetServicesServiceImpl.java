package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.entity.VetService;
import org.yusinawa.practice.repository.VetServiceRepository;
import org.yusinawa.practice.service.VetServicesService;

import java.util.List;

@Service
@AllArgsConstructor
public class VetServicesServiceImpl implements VetServicesService {
    private final VetServiceRepository vetServiceRepository;

    @Override
    public VetService getById(Long id){
        return vetServiceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service not found - " + id));
    }

    @Override
    public List<VetService> getAll(){
        return vetServiceRepository.findAll();
    }

}
