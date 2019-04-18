package pl.altkomsoftware.micronaut.perftest.order;


import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.order.api.ApproveOrderCommand;
import pl.altkomsoftware.micronaut.perftest.order.api.OrderDto;
import pl.altkomsoftware.micronaut.perftest.order.api.assemblers.OrderDtoAssembler;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class ApproveOrderHandler {
    private final OrderRepository orderRepository;
    private final OrderDtoAssembler orderDtoAssembler;

    public OrderDto handle(ApproveOrderCommand cmd){
        Order o = orderRepository.findById(cmd.getOrderId());
        o.approve();
        return orderDtoAssembler.toDto(o);
    }
}
