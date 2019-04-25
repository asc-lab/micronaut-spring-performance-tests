package pl.altkomsoftware.spring.perftest.order.api.assemblers;

import pl.altkomsoftware.spring.perftest.order.OrderLine;
import pl.altkomsoftware.spring.perftest.order.api.OrderLineDto;
import org.springframework.stereotype.Component;

@Component
public class OrderLineDtoAssembler {
    public OrderLineDto toDto(OrderLine line){
        return new OrderLineDto(
                line.getProductCode(),
                line.getPrice(),
                line.getQuantity(),
                line.getAmount()
        );
    }
}
