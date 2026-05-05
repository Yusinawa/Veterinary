package org.yusinawa.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yusinawa.practice.entity.PetType;

@Repository
public interface PetTypeRepository extends JpaRepository<PetType, String> {
}
