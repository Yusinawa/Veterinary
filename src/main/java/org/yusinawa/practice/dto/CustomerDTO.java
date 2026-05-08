package org.yusinawa.practice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.With;

@With
@Builder(toBuilder = true)
public record CustomerDTO (
        Long id,
        String firstName,
        String surname,
        String phone,
        String email
){

}
