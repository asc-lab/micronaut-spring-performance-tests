package pl.altkomsoftware.micronaut.perftest.order.api.assemblers;

import pl.altkomsoftware.micronaut.perftest.order.OrderLine;
import pl.altkomsoftware.micronaut.perftest.order.api.OrderLineDto;

import javax.inject.Singleton;

@Singleton
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
