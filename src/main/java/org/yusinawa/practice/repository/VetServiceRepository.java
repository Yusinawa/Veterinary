package org.yusinawa.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yusinawa.practice.entity.VetService;

@Repository
public interface VetServiceRepository extends JpaRepository<VetService, Long> {
}
