package pl.altkomsoftware.micronaut.perftest.order.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineDto {
    private String productCode;
    private BigDecimal price;
    private Integer quantity;
    private BigDecimal amount;
}
