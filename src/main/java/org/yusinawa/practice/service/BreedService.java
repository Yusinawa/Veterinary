package org.yusinawa.practice.service;

import org.yusinawa.practice.entity.Breed;

import java.util.List;

public interface BreedService {
    Breed getById(String title);
    List<Breed> getAll();
}
