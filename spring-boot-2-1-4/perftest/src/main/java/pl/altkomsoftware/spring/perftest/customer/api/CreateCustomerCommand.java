package pl.altkomsoftware.spring.perftest.customer.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCustomerCommand {
    private String name;
    private String country;
    private String zipCode;
    private String city;
    private String street;
}
