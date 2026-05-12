package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.CustomerDTO;
import org.yusinawa.practice.entity.Customer;
import org.yusinawa.practice.repository.CustomerRepository;
import org.yusinawa.practice.service.CustomerService;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public Customer getById(Long id){
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found - " + id));
    }

    @Override
    public Customer create(CustomerDTO dto){
        return customerRepository.save(Customer.builder()
                .firstName(dto.firstName())
                .surname(dto.surname())
                .phone(dto.phone())
                .email(dto.email())
                .build());
    }

    @Override
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    @Override
    public Customer update(Customer customer){
        return customerRepository.save(customer);
    }

    @Override
    public void delete(Long id){
        customerRepository.deleteById(id);
    }
}
