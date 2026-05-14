package org.yusinawa.practice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.yusinawa.practice.dto.DoctorDTO;
import org.yusinawa.practice.entity.Doctor;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DoctorMapper {
    DoctorDTO toDTO(Doctor doctor);

    Doctor toEntity(DoctorDTO dto);

    List<DoctorDTO> toDTOList(List<Doctor> doctors);
}
