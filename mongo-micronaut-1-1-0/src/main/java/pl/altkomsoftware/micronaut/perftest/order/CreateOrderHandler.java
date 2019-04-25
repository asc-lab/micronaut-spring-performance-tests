package pl.altkomsoftware.micronaut.perftest.order;


import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.customer.Customer;
import pl.altkomsoftware.micronaut.perftest.customer.CustomerRepository;
import pl.altkomsoftware.micronaut.perftest.order.api.CreateOrderCommand;
import pl.altkomsoftware.micronaut.perftest.order.api.OrderDto;
import pl.altkomsoftware.micronaut.perftest.order.api.assemblers.OrderDtoAssembler;

import javax.inject.Singleton;

@Singleton
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
