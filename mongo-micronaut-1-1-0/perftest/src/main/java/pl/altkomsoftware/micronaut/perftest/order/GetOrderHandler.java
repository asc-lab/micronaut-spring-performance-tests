package pl.altkomsoftware.micronaut.perftest.order;

import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.order.api.GetOrderQuery;
import pl.altkomsoftware.micronaut.perftest.order.api.OrderDto;
import pl.altkomsoftware.micronaut.perftest.order.api.assemblers.OrderDtoAssembler;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class GetOrderHandler {
    private final OrderRepository orderRepository;
    private final OrderDtoAssembler orderDtoAssembler;

    public OrderDto handle(GetOrderQuery query){
        Order o = orderRepository.findById(query.getOrderId());
        return orderDtoAssembler.toDto(o);
    }
}
