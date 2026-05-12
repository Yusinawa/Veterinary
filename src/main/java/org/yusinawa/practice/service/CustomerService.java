package org.yusinawa.practice.service;

import org.yusinawa.practice.dto.CustomerDTO;
import org.yusinawa.practice.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer getById(Long id);
    Customer create(CustomerDTO dto);
    List<Customer> getAll();
    Customer update(Customer customer);
    void delete(Long id);
}
