package pl.altkomsoftware.micronaut.perftest.order;

import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.order.api.OrderDto;
import pl.altkomsoftware.micronaut.perftest.order.api.SubmitOrderCommand;
import pl.altkomsoftware.micronaut.perftest.order.api.assemblers.OrderDtoAssembler;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class SubmitOrderHandler {
    private final OrderRepository orderRepository;
    private final OrderDtoAssembler orderDtoAssembler;

    public OrderDto handle(SubmitOrderCommand cmd){
        Order o = orderRepository.findById(cmd.getOrderId());
        o.sumbit();
        return orderDtoAssembler.toDto(o);
    }
}
