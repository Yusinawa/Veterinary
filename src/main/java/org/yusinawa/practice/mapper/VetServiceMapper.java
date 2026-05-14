package org.yusinawa.practice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.yusinawa.practice.dto.VetServiceDTO;
import org.yusinawa.practice.entity.VetService;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VetServiceMapper {
    VetServiceDTO toDTO(VetService vetService);

    List<VetServiceDTO> toDTOList(List<VetService> vetServices);
}
