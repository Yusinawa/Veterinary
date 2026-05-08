package org.yusinawa.practice.dto;

import lombok.Builder;
import lombok.With;

import java.math.BigDecimal;

@With
@Builder(toBuilder = true)
public record VetServiceDTO(
        Long id,
        String title,
        BigDecimal price
) {

}
