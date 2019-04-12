package com.asc.lab.perftest.order;

import com.asc.lab.perftest.order.api.GetOrderQuery;
import com.asc.lab.perftest.order.api.OrderDto;
import com.asc.lab.perftest.order.api.assemblers.OrderDtoAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
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
