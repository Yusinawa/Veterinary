package org.yusinawa.practice.dto;

import lombok.Data;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class PetDTO {

    private String nickname;
    private String gender;
    private LocalDate birthday;
    private String diagnosis;
    private BigDecimal weight;
    private String petType;
    private String breed;
    private Long customerId;
}
