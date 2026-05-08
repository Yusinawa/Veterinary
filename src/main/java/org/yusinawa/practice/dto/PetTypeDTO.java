package org.yusinawa.practice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.With;

@With
@Builder(toBuilder = true)
public record PetTypeDTO (
        String title
){

}
