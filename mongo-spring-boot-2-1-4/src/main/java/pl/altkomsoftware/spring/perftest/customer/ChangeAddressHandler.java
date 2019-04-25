package pl.altkomsoftware.spring.perftest.customer;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.altkomsoftware.spring.perftest.customer.api.ChangeCustomerAddressCommand;
import pl.altkomsoftware.spring.perftest.customer.api.CustomerDto;
import pl.altkomsoftware.spring.perftest.customer.api.assemblers.CustomerDtoAssembler;

@Service
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
        customerRepository.save(c);
        return customerDtoAssembler.toDto(c);
    }
}
