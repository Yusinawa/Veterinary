package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yusinawa.practice.dto.CustomerDTO;
import org.yusinawa.practice.entity.Customer;
import org.yusinawa.practice.service.CustomerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Customer create(@RequestBody CustomerDTO dto){
        return customerService.create(dto);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> readAll(){
        return new ResponseEntity<>(customerService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.getById(id);
    }

    @PutMapping
    public ResponseEntity<Customer> update(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.update(customer), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        customerService.delete(id);
    }
}
