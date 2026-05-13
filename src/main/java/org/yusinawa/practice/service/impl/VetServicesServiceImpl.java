package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.VetServiceDTO;
import org.yusinawa.practice.entity.VetService;
import org.yusinawa.practice.mapper.VetServiceMapper;
import org.yusinawa.practice.repository.VetServiceRepository;
import org.yusinawa.practice.service.VetServicesService;

import java.util.List;

@Service
@AllArgsConstructor
public class VetServicesServiceImpl implements VetServicesService {
    private final VetServiceRepository vetServiceRepository;
    private final VetServiceMapper vetServiceMapper;

    @Override
    public VetServiceDTO getById(Long id){
        VetService vetService = vetServiceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service not found - " + id));
        return vetServiceMapper.toDTO(vetService);
    }

    @Override
    public List<VetServiceDTO> getAll(){
        List<VetService> vetServices = vetServiceRepository.findAll();
        return vetServiceMapper.toDTOList(vetServices);
    }

}
