package org.yusinawa.practice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.CustomerDTO;
import org.yusinawa.practice.entity.Customer;
import org.yusinawa.practice.repository.CustomerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer getById(Long id){
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found - " + id));
    }

    public Customer create(CustomerDTO dto){
        return customerRepository.save(Customer.builder()
                .firstName(dto.firstName())
                .surname(dto.surname())
                .phone(dto.phone())
                .email(dto.email())
                .build());
    }

    public List<Customer> readAll(){
        return customerRepository.findAll();
    }

    public Customer update(Customer customer){
        return customerRepository.save(customer);
    }

    public void delete(Long id){
        customerRepository.deleteById(id);
    }
}
