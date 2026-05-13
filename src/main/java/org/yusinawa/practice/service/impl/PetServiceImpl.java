package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.PetDTO;
import org.yusinawa.practice.entity.Pet;
import org.yusinawa.practice.mapper.PetMapper;
import org.yusinawa.practice.repository.PetRepository;
import org.yusinawa.practice.service.*;

import java.util.List;

@Service
@AllArgsConstructor
public class PetServiceImpl implements PetService {
    private final PetRepository petRepository;
    private final PetMapper petMapper;

    @Override
    public PetDTO getById(Long id){
        Pet pet = petRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Pet not found - " + id));
        return petMapper.toDTO(pet);
    }

    @Override
    public PetDTO create(PetDTO dto){
        Pet pet = petMapper.toEntity(dto);
        Pet savedPet = petRepository.save(pet);
        return petMapper.toDTO(savedPet);
    }

    @Override
    public List<PetDTO> getAll(){
        List<Pet> pets = petRepository.findAll();
        return petMapper.toDTOList(pets);
    }

    @Override
    public List<PetDTO> findByCustomerId(Long id){
        List<Pet> pets = petRepository.findByCustomerId(id);
        return petMapper.toDTOList(pets);
    }

    @Override
    public PetDTO update(PetDTO dto){
        Pet pet = petMapper.toEntity(dto);
        Pet updatePet = petRepository.save(pet);
        return petMapper.toDTO(updatePet);
    }

    @Override
    public void delete(Long id){
        petRepository.deleteById(id);
    }
}
