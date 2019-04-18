package pl.altkomsoftware.micronaut.perftest.order;

import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.order.api.AddProductToOrderCommand;
import pl.altkomsoftware.micronaut.perftest.order.api.OrderDto;
import pl.altkomsoftware.micronaut.perftest.order.api.assemblers.OrderDtoAssembler;
import pl.altkomsoftware.micronaut.perftest.product.Product;
import pl.altkomsoftware.micronaut.perftest.product.ProductRepository;

import javax.inject.Singleton;

@Singleton
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
