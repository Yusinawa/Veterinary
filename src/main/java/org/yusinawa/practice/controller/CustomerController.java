package org.yusinawa.practice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.yusinawa.practice.dto.CustomerDTO;
import org.yusinawa.practice.service.CustomerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO create(@RequestBody CustomerDTO dto){
        return customerService.create(dto);
    }

    @GetMapping
    public List<CustomerDTO> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/{id}")
    public CustomerDTO getCustomerById(@PathVariable Long id){
        return customerService.getById(id);
    }

    @PutMapping
    public CustomerDTO update(@RequestBody CustomerDTO dto){
        return customerService.update(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        customerService.delete(id);
    }
}
