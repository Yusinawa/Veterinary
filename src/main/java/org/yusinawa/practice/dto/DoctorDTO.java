package org.yusinawa.practice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.With;

@With
@Builder(toBuilder = true)
public record DoctorDTO (
        Long id,
        String firstName,
        String surname,
        String phone,
        String login,
        String password
){

}
