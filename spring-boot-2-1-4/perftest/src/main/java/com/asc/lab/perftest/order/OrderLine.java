package com.asc.lab.perftest.order;

import com.asc.lab.perftest.product.Product;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Embeddable
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
