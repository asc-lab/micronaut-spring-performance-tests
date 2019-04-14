package perftest.order;

import io.micronaut.spring.tx.annotation.Transactional;
import perftest.order.api.AddProductToOrderCommand;
import perftest.order.api.OrderDto;
import perftest.order.api.assemblers.OrderDtoAssembler;
import perftest.product.Product;
import perftest.product.ProductRepository;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
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
