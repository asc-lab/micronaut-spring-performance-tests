package pl.altkomsoftware.spring.perftest.order.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private UUID orderId;
    private String customerName;
    private String orderStatus;
    private List<OrderLineDto> lines;
}
