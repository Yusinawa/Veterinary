package org.yusinawa.practice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.yusinawa.practice.dto.BreedDTO;
import org.yusinawa.practice.entity.Breed;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BreedMapper {
    @Mapping(source = "petType.title", target = "petType")
    BreedDTO toDTO(Breed breed);

    List<BreedDTO> toDTOList(List<Breed> breeds);
}
