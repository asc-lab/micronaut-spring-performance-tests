package pl.altkomsoftware.micronaut.perftest.product;

import lombok.Getter;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.UUID;

@Getter
public class Category {
    private UUID id;
    private String code;
    private String name;

    @BsonCreator
    public Category(@BsonProperty("id") UUID id,@BsonProperty("code") String code, @BsonProperty("name") String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Category(String code, String name) {
        this.id = UUID.randomUUID();
        this.code = code;
        this.name = name;
    }
}
