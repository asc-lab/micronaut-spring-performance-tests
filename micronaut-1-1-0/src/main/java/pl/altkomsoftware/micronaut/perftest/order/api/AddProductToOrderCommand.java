package pl.altkomsoftware.micronaut.perftest.order.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddProductToOrderCommand {
    private Long orderId;
    private String productCode;
    private Integer quantity;
}
