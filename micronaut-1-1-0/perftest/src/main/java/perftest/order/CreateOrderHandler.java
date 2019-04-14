package perftest.order;


import io.micronaut.spring.tx.annotation.Transactional;
import perftest.customer.Customer;
import perftest.customer.CustomerRepository;
import perftest.order.api.CreateOrderCommand;
import perftest.order.api.OrderDto;
import perftest.order.api.assemblers.OrderDtoAssembler;
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
