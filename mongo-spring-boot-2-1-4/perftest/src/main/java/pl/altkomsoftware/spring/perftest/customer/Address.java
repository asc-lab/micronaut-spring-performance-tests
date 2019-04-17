package pl.altkomsoftware.spring.perftest.customer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class Address {
    private String country;
    private String zipCode;
    private String city;
    private String street;
}
