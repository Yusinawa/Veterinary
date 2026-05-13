package org.yusinawa.practice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.yusinawa.practice.dto.PetDTO;
import org.yusinawa.practice.entity.Pet;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PetMapper {
    @Mapping(source = "petType.title", target = "petType")
    @Mapping(source = "breed.title", target = "breed")
    @Mapping(source = "customer.id", target = "customer")
    PetDTO toDTO(Pet pet);

    List<PetDTO> toDTOList(List<Pet> pets);

    @Mapping(source = "petType", target = "petType.title")
    @Mapping(source = "breed", target = "breed.title")
    @Mapping(source = "customer", target = "customer.id")
    Pet toEntity(PetDTO dto);
}
