package org.yusinawa.practice.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AppointmentDTO {

    private LocalDate date;
    private String status;
    private Long doctorId;
    private Long serviceId;
    private Long customerId;
}
