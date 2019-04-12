package com.asc.lab.perftest.customer;

import com.asc.lab.perftest.customer.api.CreateCustomerCommand;
import com.asc.lab.perftest.customer.api.CustomerDto;
import com.asc.lab.perftest.customer.api.assemblers.CustomerDtoAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CreateCustomerHandler {
    private final CustomerRepository customerRepository;
    private final CustomerDtoAssembler customerDtoAssembler;

    public CustomerDto handle(CreateCustomerCommand cmd){
        Customer c = new Customer(
                cmd.getName(),
                new Address(
                        cmd.getCountry(),
                        cmd.getZipCode(),
                        cmd.getCity(),
                        cmd.getStreet()
                ),
                false
        );

        customerRepository.save(c);

        return customerDtoAssembler.toDto(c);
    }
}
