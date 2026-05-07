package org.yusinawa.practice.dto;

import lombok.Data;

import java.time.LocalDate;

public record AppointmentDTO (Long id, LocalDate date, String status, Long doctorId, Long serviceId, Long customerId){}
