package perftest.order;


import io.micronaut.spring.tx.annotation.Transactional;
import perftest.order.api.ApproveOrderCommand;
import perftest.order.api.OrderDto;
import perftest.order.api.assemblers.OrderDtoAssembler;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@Transactional
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
