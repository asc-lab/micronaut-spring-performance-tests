package pl.altkomsoftware.spring.perftest.order.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddProductToOrderCommand {
    private UUID orderId;
    private String productCode;
    private Integer quantity;
}
