package perftest.order;

import io.micronaut.spring.tx.annotation.Transactional;
import perftest.order.api.GetOrderQuery;
import perftest.order.api.OrderDto;
import perftest.order.api.assemblers.OrderDtoAssembler;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class GetOrderHandler {
    private final OrderRepository orderRepository;
    private final OrderDtoAssembler orderDtoAssembler;

    public OrderDto handle(GetOrderQuery query){
        Order o = orderRepository.findById(query.getOrderId());
        return orderDtoAssembler.toDto(o);
    }
}
