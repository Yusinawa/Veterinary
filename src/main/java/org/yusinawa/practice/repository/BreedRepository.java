package org.yusinawa.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yusinawa.practice.entity.Breed;

@Repository
public interface BreedRepository extends JpaRepository<Breed, String> {
}
