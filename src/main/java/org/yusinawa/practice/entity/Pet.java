package org.yusinawa.practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

    @Id
    private Long id;
    private String nickname;
    private String gender;
    private LocalDate birthday;
    private String diagnosis;
    private BigDecimal weight;
    private String petType;
    private String breed;
    private Long customerId;
}
