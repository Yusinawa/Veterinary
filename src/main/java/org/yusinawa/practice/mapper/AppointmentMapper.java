package org.yusinawa.practice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.yusinawa.practice.dto.AppointmentDTO;
import org.yusinawa.practice.entity.Appointment;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AppointmentMapper {
    @Mapping(source = "doctor.id", target = "doctor")
    @Mapping(source = "service.id", target = "service")
    @Mapping(source = "customer.id", target = "customer")
    AppointmentDTO toDTO(Appointment appointment);

    List<AppointmentDTO> toDTOList(List<Appointment> appointments);

    @Mapping(source = "doctor", target = "doctor.id")
    @Mapping(source = "service", target = "service.id")
    @Mapping(source = "customer", target = "customer.id")
    Appointment toEntity(AppointmentDTO dto);
}
