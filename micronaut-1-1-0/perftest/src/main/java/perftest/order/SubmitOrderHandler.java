package perftest.order;

import io.micronaut.spring.tx.annotation.Transactional;
import perftest.order.api.OrderDto;
import perftest.order.api.SubmitOrderCommand;
import perftest.order.api.assemblers.OrderDtoAssembler;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@Transactional
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
