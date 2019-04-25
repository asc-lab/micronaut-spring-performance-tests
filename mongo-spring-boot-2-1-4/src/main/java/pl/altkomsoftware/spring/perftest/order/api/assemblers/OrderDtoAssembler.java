package pl.altkomsoftware.spring.perftest.order.api.assemblers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.altkomsoftware.spring.perftest.order.Order;
import pl.altkomsoftware.spring.perftest.order.api.OrderDto;

import java.util.stream.Collectors;

@Component
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
