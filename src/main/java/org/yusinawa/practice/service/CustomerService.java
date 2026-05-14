package org.yusinawa.practice.service;

import org.yusinawa.practice.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO getById(Long id);
    CustomerDTO create(CustomerDTO dto);
    List<CustomerDTO> getAll();
    CustomerDTO update(CustomerDTO dto);
    void delete(Long id);
}
