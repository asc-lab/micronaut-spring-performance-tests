package pl.altkomsoftware.micronaut.perftest.order;


import io.micronaut.spring.tx.annotation.Transactional;
import pl.altkomsoftware.micronaut.perftest.customer.Customer;
import pl.altkomsoftware.micronaut.perftest.customer.CustomerRepository;
import pl.altkomsoftware.micronaut.perftest.order.api.CreateOrderCommand;
import pl.altkomsoftware.micronaut.perftest.order.api.OrderDto;
import pl.altkomsoftware.micronaut.perftest.order.api.assemblers.OrderDtoAssembler;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@Transactional
@RequiredArgsConstructor
public class CreateOrderHandler {
    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;
    private final OrderDtoAssembler orderDtoAssembler;

    public OrderDto handle(CreateOrderCommand cmd){
        Customer c = customerRepository.findByName(cmd.getCustomerName());
        Order o = new Order(c);
        orderRepository.save(o);
        return orderDtoAssembler.toDto(o);
    }
}
