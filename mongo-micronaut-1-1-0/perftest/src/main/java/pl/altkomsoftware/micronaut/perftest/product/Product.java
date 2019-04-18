package pl.altkomsoftware.micronaut.perftest.product;

import lombok.Getter;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class Product {
    private UUID id;
    private String code;
    private String name;
    private String category;
    private BigDecimal price;

    @BsonCreator
    public Product(
            @BsonProperty("id") UUID id,
            @BsonProperty("code") String code,
            @BsonProperty("name") String name,
            @BsonProperty("category") String category,
            @BsonProperty("price") BigDecimal price) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Product(String code, String name, Category category, BigDecimal price) {
        this.id = UUID.randomUUID();
        this.code = code;
        this.name = name;
        this.category = category.getCode();
        this.price = price;
    }

    public void changePrice(BigDecimal newPrice){
        price = newPrice;
    }

    public void changeCategory(Category newCategory){
        category = newCategory.getCode();
    }
}
