package pl.altkomsoftware.micronaut.perftest.customer.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private String name;
    private Boolean isVip;
    private String country;
    private String zipCode;
    private String city;
    private String street;
}

