package org.yusinawa.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yusinawa.practice.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
