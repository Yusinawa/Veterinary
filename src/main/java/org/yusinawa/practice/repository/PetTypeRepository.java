package org.yusinawa.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yusinawa.practice.entity.PetType;
import org.yusinawa.practice.service.PetTypeService;

import java.util.Optional;

@Repository
public interface PetTypeRepository extends JpaRepository<PetType, String> {
    Optional<PetType> findByTitle(String title);
}
