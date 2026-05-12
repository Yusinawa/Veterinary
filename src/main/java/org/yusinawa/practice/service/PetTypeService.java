package org.yusinawa.practice.service;

import org.yusinawa.practice.entity.PetType;

import java.util.List;

public interface PetTypeService {
    PetType getById(String title);
    List<PetType> getAll();
}
