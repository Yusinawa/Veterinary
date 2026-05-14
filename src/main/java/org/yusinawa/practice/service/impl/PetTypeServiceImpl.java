package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.PetTypeDTO;
import org.yusinawa.practice.entity.PetType;
import org.yusinawa.practice.mapper.PetTypeMapper;
import org.yusinawa.practice.repository.PetTypeRepository;
import org.yusinawa.practice.service.PetTypeService;

import java.util.List;

@Service
@AllArgsConstructor
public class PetTypeServiceImpl implements PetTypeService {
    private final PetTypeRepository petTypeRepository;
    private final PetTypeMapper petTypeMapper;

    @Override
    public PetTypeDTO getById(String title){
        PetType petType = petTypeRepository.findById(title)
                .orElseThrow(() -> new RuntimeException("Pet type not found - " + title));
        return petTypeMapper.toDTO(petType);
    }

    @Override
    public List<PetTypeDTO> getAll(){
        List<PetType> petTypes = petTypeRepository.findAll();
        return petTypeMapper.toDTOList(petTypes);
    }
}
