package pl.altkomsoftware.spring.perftest.order;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.altkomsoftware.spring.perftest.customer.Customer;
import pl.altkomsoftware.spring.perftest.customer.CustomerRepository;
import pl.altkomsoftware.spring.perftest.order.api.CreateOrderCommand;
import pl.altkomsoftware.spring.perftest.order.api.OrderDto;
import pl.altkomsoftware.spring.perftest.order.api.assemblers.OrderDtoAssembler;

@Service
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
