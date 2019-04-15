package pl.altkomsoftware.spring.perftest.customer;


import pl.altkomsoftware.spring.perftest.customer.api.CustomerDto;
import pl.altkomsoftware.spring.perftest.customer.api.GetCustomerQuery;
import pl.altkomsoftware.spring.perftest.customer.api.assemblers.CustomerDtoAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class GetCustomerHandler {
    private final CustomerRepository customerRepository;
    private final CustomerDtoAssembler customerDtoAssembler;

    public CustomerDto handle(GetCustomerQuery query){
        return customerDtoAssembler.toDto(customerRepository.findByName(query.getName()));
    }
}
