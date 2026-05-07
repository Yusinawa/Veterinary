package org.yusinawa.practice.dto;

import lombok.Data;

public record CustomerDTO (Long id, String firstName, String surname, String phone, String email){}
