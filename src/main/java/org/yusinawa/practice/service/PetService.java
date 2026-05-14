package org.yusinawa.practice.service;

import org.yusinawa.practice.dto.PetDTO;

import java.util.List;

public interface PetService {
    PetDTO getById(Long id);
    PetDTO create(PetDTO dto);
    List<PetDTO> getAll();
    List<PetDTO> findByCustomerId(Long id);
    PetDTO update(PetDTO dto);
    void delete(Long id);
}
