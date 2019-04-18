package pl.altkomsoftware.micronaut.perftest.order;

import lombok.Getter;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonProperty;
import pl.altkomsoftware.micronaut.perftest.product.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Getter
public class OrderLine {
    private String productCode;
    private BigDecimal price;
    private Integer quantity;
    private BigDecimal amount;

    @BsonCreator
    public OrderLine(
            @BsonProperty("productCode") String productCode,
            @BsonProperty("price") BigDecimal price,
            @BsonProperty("quantity") Integer quantity,
            @BsonProperty("amount") BigDecimal amount) {
        this.productCode = productCode;
        this.price = price;
        this.quantity = quantity;
        this.amount = amount;
    }

    public OrderLine(Product product, Integer quantity) {
        this.productCode = product.getCode();
        this.price = product.getPrice();
        this.quantity = quantity;
        this.amount = this.price.multiply(new BigDecimal(this.quantity)).setScale(2, RoundingMode.HALF_EVEN);
    }
}
