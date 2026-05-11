package org.yusinawa.practice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.entity.Breed;
import org.yusinawa.practice.repository.BreedRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BreedService {
    private final BreedRepository breedRepository;

    public Breed getById(String title){
        return breedRepository.findById(title)
                .orElseThrow(() -> new RuntimeException("Breed not found - " + title));
    }

    public List<Breed> readAll(){
        return breedRepository.findAll();
    }
}
