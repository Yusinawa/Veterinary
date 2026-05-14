package org.yusinawa.practice.service;

import org.yusinawa.practice.dto.VetServiceDTO;

import java.util.List;

public interface VetServicesService {
    VetServiceDTO getById(Long id);
    List<VetServiceDTO> getAll();
}
