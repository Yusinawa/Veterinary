package org.yusinawa.practice.dto;

import lombok.Builder;
import lombok.With;
import org.yusinawa.practice.entity.Customer;
import org.yusinawa.practice.entity.Doctor;
import org.yusinawa.practice.entity.VetService;

import java.time.LocalDate;

@With
@Builder(toBuilder = true)
public record AppointmentDTO (
        Long id,
        LocalDate date,
        String status,
        Long doctor,
        Long service,
        Long customer
){

}
