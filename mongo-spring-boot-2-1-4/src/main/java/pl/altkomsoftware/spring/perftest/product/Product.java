package pl.altkomsoftware.spring.perftest.product;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Product {
    private UUID id;
    private String code;
    private String name;
    private String category;
    private BigDecimal price;

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
