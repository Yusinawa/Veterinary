package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.entity.Breed;
import org.yusinawa.practice.repository.BreedRepository;
import org.yusinawa.practice.service.BreedService;

import java.util.List;

@Service
@AllArgsConstructor
public class BreedServiceImpl implements BreedService {
    private final BreedRepository breedRepository;

    @Override
    public Breed getById(String title){
        return breedRepository.findById(title)
                .orElseThrow(() -> new RuntimeException("Breed not found - " + title));
    }

    @Override
    public List<Breed> getAll(){
        return breedRepository.findAll();
    }
}
