package org.yusinawa.practice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.yusinawa.practice.dto.CustomerDTO;
import org.yusinawa.practice.entity.Customer;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CustomerMapper {
    CustomerDTO toDTO(Customer customer);

    Customer toEntity(CustomerDTO dto);

    List<CustomerDTO> toDTOList(List<Customer> customers);
}
