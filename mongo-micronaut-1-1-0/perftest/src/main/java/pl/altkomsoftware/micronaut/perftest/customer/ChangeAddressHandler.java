package pl.altkomsoftware.micronaut.perftest.customer;

import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.customer.api.ChangeCustomerAddressCommand;
import pl.altkomsoftware.micronaut.perftest.customer.api.CustomerDto;
import pl.altkomsoftware.micronaut.perftest.customer.api.assembler.CustomerDtoAssembler;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class ChangeAddressHandler {
    private final CustomerRepository customerRepository;
    private final CustomerDtoAssembler customerDtoAssembler;

    public CustomerDto handle(ChangeCustomerAddressCommand cmd){
        Customer c = customerRepository.findByName(cmd.getName());
        c.changeAddress(new Address(
                cmd.getCountry(),
                cmd.getZipCode(),
                cmd.getCity(),
                cmd.getStreet()
        ));

        return customerDtoAssembler.toDto(c);
    }
}
