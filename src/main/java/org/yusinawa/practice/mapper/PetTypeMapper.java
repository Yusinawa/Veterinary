package org.yusinawa.practice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.yusinawa.practice.dto.PetTypeDTO;
import org.yusinawa.practice.entity.PetType;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PetTypeMapper {
    PetTypeDTO toDTO(PetType petType);

    List<PetTypeDTO> toDTOList(List<PetType> petTypes);
}
