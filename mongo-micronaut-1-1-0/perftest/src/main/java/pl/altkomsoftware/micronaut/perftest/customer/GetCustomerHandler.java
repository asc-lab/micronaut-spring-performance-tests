package pl.altkomsoftware.micronaut.perftest.customer;

import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.customer.api.CustomerDto;
import pl.altkomsoftware.micronaut.perftest.customer.api.GetCustomerQuery;
import pl.altkomsoftware.micronaut.perftest.customer.api.assembler.CustomerDtoAssembler;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class GetCustomerHandler {
    private final CustomerRepository customerRepository;
    private final CustomerDtoAssembler customerDtoAssembler;

    public CustomerDto handle(GetCustomerQuery query){
        return customerDtoAssembler.toDto(customerRepository.findByName(query.getName()));
    }
}
