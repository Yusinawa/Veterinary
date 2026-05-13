package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.entity.PetType;
import org.yusinawa.practice.repository.PetTypeRepository;
import org.yusinawa.practice.service.PetTypeService;

import java.util.List;

@Service
@AllArgsConstructor
public class PetTypeServiceImpl implements PetTypeService {
    private final PetTypeRepository petTypeRepository;

    @Override
    public PetType getById(String title){
        return petTypeRepository.findById(title)
                .orElseThrow(() -> new RuntimeException("Pet type not found - " + title));
    }

    @Override
    public List<PetType> getAll(){
        return petTypeRepository.findAll();
    }
}
