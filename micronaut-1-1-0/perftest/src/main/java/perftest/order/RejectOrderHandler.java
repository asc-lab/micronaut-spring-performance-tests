package perftest.order;

import io.micronaut.spring.tx.annotation.Transactional;
import perftest.order.api.OrderDto;
import perftest.order.api.RejectOrderCommand;
import perftest.order.api.assemblers.OrderDtoAssembler;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@Transactional
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
