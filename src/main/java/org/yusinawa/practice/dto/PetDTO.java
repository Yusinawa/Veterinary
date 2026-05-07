package org.yusinawa.practice.dto;

import lombok.Data;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

public record PetDTO (Long id, String nickname, String gender, LocalDate birthday, String giagnosis, BigDecimal weight,
                      String petType, String breed, Long customerId) {}
