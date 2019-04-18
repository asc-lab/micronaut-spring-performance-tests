package pl.altkomsoftware.micronaut.perftest.customer;

import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.customer.api.CustomerDto;
import pl.altkomsoftware.micronaut.perftest.customer.api.MakeCustomerVipCommand;
import pl.altkomsoftware.micronaut.perftest.customer.api.assembler.CustomerDtoAssembler;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class MakeCustomerVipHandler {
    private final CustomerRepository customerRepository;
    private final CustomerDtoAssembler customerDtoAssembler;

    public CustomerDto handle(MakeCustomerVipCommand cmd){
        Customer c = customerRepository.findByName(cmd.getName());
        c.makeVip();
        return customerDtoAssembler.toDto(c);
    }
}
