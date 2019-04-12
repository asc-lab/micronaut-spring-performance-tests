package com.asc.lab.perftest.order;

import com.asc.lab.perftest.order.api.AddProductToOrderCommand;
import com.asc.lab.perftest.order.api.OrderDto;
import com.asc.lab.perftest.order.api.assemblers.OrderDtoAssembler;
import com.asc.lab.perftest.product.Product;
import com.asc.lab.perftest.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AddProductToOrderHandler {
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;
    private final OrderDtoAssembler orderDtoAssembler;

    public OrderDto handle(AddProductToOrderCommand cmd){
        Product p = productRepository.findByCode(cmd.getProductCode());
        Order o = orderRepository.findById(cmd.getOrderId());
        o.addProduct(p,cmd.getQuantity());
        return orderDtoAssembler.toDto(o);
    }
}
