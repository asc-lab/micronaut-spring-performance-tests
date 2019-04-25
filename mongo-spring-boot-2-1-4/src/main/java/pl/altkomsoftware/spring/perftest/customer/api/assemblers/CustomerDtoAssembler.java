package pl.altkomsoftware.spring.perftest.customer.api.assemblers;

import org.springframework.stereotype.Component;
import pl.altkomsoftware.spring.perftest.customer.Customer;
import pl.altkomsoftware.spring.perftest.customer.api.CustomerDto;

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
