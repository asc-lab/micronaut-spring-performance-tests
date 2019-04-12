package perftest.customer;

import io.micronaut.spring.tx.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import perftest.customer.Address;
import perftest.customer.Customer;
import perftest.customer.CustomerRepository;
import perftest.customer.api.CreateCustomerCommand;
import perftest.customer.api.CustomerDto;
import perftest.customer.api.assembler.CustomerDtoAssembler;

import javax.inject.Singleton;

@Singleton
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
