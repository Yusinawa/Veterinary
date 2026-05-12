package org.yusinawa.practice.service;

import org.yusinawa.practice.dto.PetDTO;
import org.yusinawa.practice.entity.Pet;

import java.util.List;

public interface PetService {
    Pet getById(Long id);
    Pet create(PetDTO dto);
    List<Pet> getAll();
    List<Pet> findByCustomerId(Long id);
    Pet update(Pet pet);
    void delete(Long id);
}
