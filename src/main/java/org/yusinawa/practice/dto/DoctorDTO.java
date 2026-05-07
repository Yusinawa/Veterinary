package org.yusinawa.practice.dto;

import lombok.Data;

public record DoctorDTO (Long id, String firstName, String surname, String phone, String login, String password){}
