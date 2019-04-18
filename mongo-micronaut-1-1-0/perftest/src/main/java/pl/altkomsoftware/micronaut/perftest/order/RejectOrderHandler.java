package pl.altkomsoftware.micronaut.perftest.order;

import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.order.api.OrderDto;
import pl.altkomsoftware.micronaut.perftest.order.api.RejectOrderCommand;
import pl.altkomsoftware.micronaut.perftest.order.api.assemblers.OrderDtoAssembler;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class RejectOrderHandler {
    private final OrderRepository orderRepository;
    private final OrderDtoAssembler orderDtoAssembler;

    public OrderDto handle(RejectOrderCommand cmd){
        Order o = orderRepository.findById(cmd.getOrderId());
        o.reject();
        return orderDtoAssembler.toDto(o);
    }
}
