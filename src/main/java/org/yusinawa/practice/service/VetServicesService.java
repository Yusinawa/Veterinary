package org.yusinawa.practice.service;

import org.yusinawa.practice.entity.VetService;

import java.util.List;

public interface VetServicesService {
    VetService getById(Long id);
    List<VetService> getAll();
}
