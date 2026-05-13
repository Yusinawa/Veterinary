package org.yusinawa.practice.dto;

import lombok.Builder;
import lombok.With;

import java.math.BigDecimal;
import java.time.LocalDate;

@With
@Builder(toBuilder = true)
public record PetDTO (
        Long id,
        String nickname,
        String gender,
        LocalDate birthday,
        String diagnosis,
        BigDecimal weight,
        String petType,
        String breed,
        Long customer
) {

}
