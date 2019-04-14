package perftest.order.api.assemblers;

import perftest.order.OrderLine;
import perftest.order.api.OrderLineDto;

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
