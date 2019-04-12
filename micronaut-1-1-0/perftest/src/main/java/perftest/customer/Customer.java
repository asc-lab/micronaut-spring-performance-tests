package perftest.customer;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Embedded
    private Address address;

    private Boolean isVip;

    public Customer(String name, Address address, Boolean isVip) {
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

