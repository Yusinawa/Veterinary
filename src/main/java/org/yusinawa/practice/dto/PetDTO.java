package org.yusinawa.practice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.With;
import org.springframework.cglib.core.Local;
import org.yusinawa.practice.entity.Breed;
import org.yusinawa.practice.entity.Customer;
import org.yusinawa.practice.entity.PetType;

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
        PetType petType,
        Breed breed,
        Customer customerId
) {

}
