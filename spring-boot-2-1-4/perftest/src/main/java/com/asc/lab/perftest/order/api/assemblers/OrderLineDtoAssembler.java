package com.asc.lab.perftest.order.api.assemblers;

import com.asc.lab.perftest.order.OrderLine;
import com.asc.lab.perftest.order.api.OrderLineDto;
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
