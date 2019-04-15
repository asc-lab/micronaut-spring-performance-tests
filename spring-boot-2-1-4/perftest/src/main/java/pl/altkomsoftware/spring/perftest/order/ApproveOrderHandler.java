package pl.altkomsoftware.spring.perftest.order;


import pl.altkomsoftware.spring.perftest.order.api.ApproveOrderCommand;
import pl.altkomsoftware.spring.perftest.order.api.OrderDto;
import pl.altkomsoftware.spring.perftest.order.api.assemblers.OrderDtoAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
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
