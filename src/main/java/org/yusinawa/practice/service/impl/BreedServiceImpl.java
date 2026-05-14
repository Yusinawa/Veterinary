package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.BreedDTO;
import org.yusinawa.practice.entity.Breed;
import org.yusinawa.practice.mapper.BreedMapper;
import org.yusinawa.practice.repository.BreedRepository;
import org.yusinawa.practice.service.BreedService;

import java.util.List;

@Service
@AllArgsConstructor
public class BreedServiceImpl implements BreedService {
    private final BreedRepository breedRepository;
    private final BreedMapper breedMapper;

    @Override
    public BreedDTO getById(String title){
        Breed breed = breedRepository.findById(title)
                .orElseThrow(() -> new RuntimeException("Breed not found - " + title));
        return breedMapper.toDTO(breed);
    }

    @Override
    public List<BreedDTO> getAll(){
        List<Breed> breeds = breedRepository.findAll();
        return breedMapper.toDTOList(breeds);
    }
}
