package pl.altkomsoftware.spring.perftest.customer;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Customer {
    private UUID id;

    private String name;

    private Address address;

    private Boolean isVip;

    public Customer(String name, Address address, Boolean isVip) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.address = address;
        this.isVip = isVip;
    }


    public void changeAddress(Address newAddress){
        address = newAddress;
    }

    public void makeVip() {
        isVip = true;
    }
}
