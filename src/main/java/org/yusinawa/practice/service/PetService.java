package org.yusinawa.practice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.PetDTO;
import org.yusinawa.practice.entity.Pet;
import org.yusinawa.practice.repository.PetRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PetService {
    private final PetRepository petRepository;
    private final CustomerService customerService;
    private final PetTypeService petTypeService;
    private final BreedService breedService;

    public Pet getById(Long id){
        return petRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Pet not found - " + id));
    }

    public Pet create(PetDTO dto){
        return petRepository.save(Pet.builder()
                .nickname(dto.nickname())
                .gender(dto.gender())
                .birthday(dto.birthday())
                .diagnosis(dto.diagnosis())
                .weight(dto.weight())
                .petType(petTypeService.getById(dto.petType()))
                .breed(breedService.getById(dto.breed()))
                .customer(customerService.getById(dto.customer()))
                .build());
    }

    public List<Pet> readAll(){
        return petRepository.findAll();
    }

    public List<Pet> findByCustomerId(Long id){
        return petRepository.findByCustomerId(id);
    }

    public Pet update(Pet pet){
        return petRepository.save(pet);
    }

    public void delete(Long id){
        petRepository.deleteById(id);
    }
}
