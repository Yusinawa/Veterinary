package org.yusinawa.practice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.With;
import org.yusinawa.practice.entity.PetType;

@With
@Builder(toBuilder = true)
public record BreedDTO (
        String title,
        PetType petType
){

}
