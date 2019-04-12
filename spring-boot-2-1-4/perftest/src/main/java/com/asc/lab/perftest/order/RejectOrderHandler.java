package com.asc.lab.perftest.order;

import com.asc.lab.perftest.order.api.OrderDto;
import com.asc.lab.perftest.order.api.RejectOrderCommand;
import com.asc.lab.perftest.order.api.assemblers.OrderDtoAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
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
