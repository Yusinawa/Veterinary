package org.yusinawa.practice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yusinawa.practice.dto.CustomerDTO;
import org.yusinawa.practice.entity.Customer;
import org.yusinawa.practice.mapper.CustomerMapper;
import org.yusinawa.practice.repository.CustomerRepository;
import org.yusinawa.practice.service.CustomerService;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerDTO getById(Long id){
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found - " + id));
        return customerMapper.toDTO(customer);
    }

    @Override
    public CustomerDTO create(CustomerDTO dto){
        Customer customer = customerMapper.toEntity(dto);
        Customer savedCustomer = customerRepository.save(customer);
        return customerMapper.toDTO(savedCustomer);
    }

    @Override
    public List<CustomerDTO> getAll(){
        List<Customer> customers = customerRepository.findAll();
        return customerMapper.toDTOList(customers);
    }

    @Override
    public CustomerDTO update(CustomerDTO dto){
        Customer customer = customerMapper.toEntity(dto);
        Customer updatedCustomer = customerRepository.save(customer);
        return customerMapper.toDTO(updatedCustomer);
    }

    @Override
    public void delete(Long id){
        customerRepository.deleteById(id);
    }
}
