package org.yusinawa.practice.service;

import org.yusinawa.practice.dto.BreedDTO;

import java.util.List;

public interface BreedService {
    BreedDTO getById(String title);
    List<BreedDTO> getAll();
}
