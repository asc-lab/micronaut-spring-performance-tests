package pl.altkomsoftware.micronaut.perftest.customer;

import lombok.Getter;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonProperty;

@Getter
public class Address {
    private String country;
    private String zipCode;
    private String city;
    private String street;

    @BsonCreator
    public Address(
            @BsonProperty("country") String country,
            @BsonProperty("zipCode") String zipCode,
            @BsonProperty("city") String city,
            @BsonProperty("street") String street) {
        this.country = country;
        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
    }
}
