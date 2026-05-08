package org.yusinawa.practice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.entity.PetType;
import org.yusinawa.practice.repository.PetTypeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetType getById(String title){
        return petTypeRepository.findById(title)
                .orElseThrow(() -> new RuntimeException("Pet type not found - " + title));
    }

    public List<PetType> readAll(){
        return petTypeRepository.findAll();
    }
}
