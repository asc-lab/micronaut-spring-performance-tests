package pl.altkomsoftware.spring.perftest.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.altkomsoftware.spring.perftest.order.api.OrderDto;
import pl.altkomsoftware.spring.perftest.order.api.RejectOrderCommand;
import pl.altkomsoftware.spring.perftest.order.api.assemblers.OrderDtoAssembler;

@Service
@RequiredArgsConstructor
public class RejectOrderHandler {
    private final OrderRepository orderRepository;
    private final OrderDtoAssembler orderDtoAssembler;

    public OrderDto handle(RejectOrderCommand cmd){
        Order o = orderRepository.findById(cmd.getOrderId());
        o.reject();
        orderRepository.save(o);
        return orderDtoAssembler.toDto(o);
    }
}
