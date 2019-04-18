package pl.altkomsoftware.micronaut.perftest.customer;

import lombok.Getter;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.UUID;

@Getter
public class Customer {
    private UUID id;


    private String name;

    private Address address;

    private Boolean isVip;

    @BsonCreator
    public Customer(
            @BsonProperty("id") UUID id,
            @BsonProperty("name") String name,
            @BsonProperty("address") Address address,
            @BsonProperty("isVip") Boolean isVip) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.isVip = isVip;
    }

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

