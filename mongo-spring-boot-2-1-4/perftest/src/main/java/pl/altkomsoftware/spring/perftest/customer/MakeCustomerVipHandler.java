package pl.altkomsoftware.spring.perftest.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.altkomsoftware.spring.perftest.customer.api.CustomerDto;
import pl.altkomsoftware.spring.perftest.customer.api.MakeCustomerVipCommand;
import pl.altkomsoftware.spring.perftest.customer.api.assemblers.CustomerDtoAssembler;

@Service
@RequiredArgsConstructor
public class MakeCustomerVipHandler {
    private final CustomerRepository customerRepository;
    private final CustomerDtoAssembler customerDtoAssembler;

    public CustomerDto handle(MakeCustomerVipCommand cmd){
        Customer c = customerRepository.findByName(cmd.getName());
        c.makeVip();
        customerRepository.save(c);
        return customerDtoAssembler.toDto(c);
    }
}
