package pl.altkomsoftware.spring.perftest.order;


import pl.altkomsoftware.spring.perftest.customer.Customer;
import pl.altkomsoftware.spring.perftest.customer.CustomerRepository;
import pl.altkomsoftware.spring.perftest.order.api.CreateOrderCommand;
import pl.altkomsoftware.spring.perftest.order.api.OrderDto;
import pl.altkomsoftware.spring.perftest.order.api.assemblers.OrderDtoAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
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
