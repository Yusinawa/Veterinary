package org.yusinawa.practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Provider;
import java.time.LocalDate;

@Entity
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    private Long id;
    private LocalDate date;
    private String status;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctorId;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private VetService serviceId;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;
}
