package pl.altkomsoftware.spring.perftest.order;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.altkomsoftware.spring.perftest.product.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class OrderLine {
    private String productCode;
    private BigDecimal price;
    private Integer quantity;
    private BigDecimal amount;

    public OrderLine(Product product, Integer quantity) {
        this.productCode = product.getCode();
        this.price = product.getPrice();
        this.quantity = quantity;
        this.amount = this.price.multiply(new BigDecimal(this.quantity)).setScale(2, RoundingMode.HALF_EVEN);
    }
}
