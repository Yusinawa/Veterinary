package org.yusinawa.practice.service;

import org.yusinawa.practice.dto.PetTypeDTO;

import java.util.List;

public interface PetTypeService {
    PetTypeDTO getById(String title);
    List<PetTypeDTO> getAll();
}
