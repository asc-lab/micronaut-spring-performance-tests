package pl.altkomsoftware.micronaut.perftest.order.api.assemblers;

import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.order.Order;
import pl.altkomsoftware.micronaut.perftest.order.api.OrderDto;

import javax.inject.Singleton;
import java.util.stream.Collectors;

@Singleton
@RequiredArgsConstructor
public class OrderDtoAssembler {
    private final OrderLineDtoAssembler orderLineDtoAssembler;

    public OrderDto toDto(Order order){
        return new OrderDto(
            order.getId(),
            order.getCustomer(),
            order.getStatus().toString(),
            order.getLines().stream().map(orderLineDtoAssembler::toDto).collect(Collectors.toList())
        );
    }
}
