package org.yusinawa.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yusinawa.practice.entity.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
}
