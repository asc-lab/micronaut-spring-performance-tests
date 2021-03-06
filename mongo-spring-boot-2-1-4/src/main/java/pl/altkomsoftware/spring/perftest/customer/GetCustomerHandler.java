package pl.altkomsoftware.spring.perftest.customer;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.altkomsoftware.spring.perftest.customer.api.CustomerDto;
import pl.altkomsoftware.spring.perftest.customer.api.GetCustomerQuery;
import pl.altkomsoftware.spring.perftest.customer.api.assemblers.CustomerDtoAssembler;

@Service
@RequiredArgsConstructor
public class GetCustomerHandler {
    private final CustomerRepository customerRepository;
    private final CustomerDtoAssembler customerDtoAssembler;

    public CustomerDto handle(GetCustomerQuery query){
        return customerDtoAssembler.toDto(customerRepository.findByName(query.getName()));
    }
}
