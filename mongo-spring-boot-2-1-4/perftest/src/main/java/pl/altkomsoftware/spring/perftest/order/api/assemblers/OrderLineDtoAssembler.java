package pl.altkomsoftware.spring.perftest.order.api.assemblers;

import org.springframework.stereotype.Component;
import pl.altkomsoftware.spring.perftest.order.OrderLine;
import pl.altkomsoftware.spring.perftest.order.api.OrderLineDto;

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
