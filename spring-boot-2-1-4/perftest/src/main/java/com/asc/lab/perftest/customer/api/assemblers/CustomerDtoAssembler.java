package com.asc.lab.perftest.customer.api.assemblers;

import com.asc.lab.perftest.customer.Customer;
import com.asc.lab.perftest.customer.api.CustomerDto;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoAssembler {
    public CustomerDto toDto(Customer customer){
        return new CustomerDto(
                customer.getName(),
                customer.getIsVip(),
                customer.getAddress().getCountry(),
                customer.getAddress().getZipCode(),
                customer.getAddress().getCity(),
                customer.getAddress().getStreet()
        );
    }
}
