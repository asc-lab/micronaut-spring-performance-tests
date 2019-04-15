package pl.altkomsoftware.micronaut.perftest.order.api;

import io.micronaut.http.annotation.*;
import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.order.*;

@Controller("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final CreateOrderHandler createOrder;
    private final AddProductToOrderHandler addProductToOrder;
    private final SubmitOrderHandler submitOrder;
    private final ApproveOrderHandler approveOrder;
    private final RejectOrderHandler rejectOrder;
    private final GetOrderHandler getOrder;

    @Post
    public OrderDto create(@Body CreateOrderCommand cmd){
        return createOrder.handle(cmd);
    }

    @Post("/addProduct")
    public OrderDto addProduct(@Body AddProductToOrderCommand cmd){
        return addProductToOrder.handle(cmd);
    }

    @Post("/submit")
    public OrderDto submit(@Body SubmitOrderCommand cmd){
        return submitOrder.handle(cmd);
    }

    @Post("/approve")
    public OrderDto approve(@Body ApproveOrderCommand cmd){
        return approveOrder.handle(cmd);
    }

    @Post("/reject")
    public OrderDto reject(@Body RejectOrderCommand cmd){
        return rejectOrder.handle(cmd);
    }

    @Get("/{id}")
    public OrderDto getById(Long id){
        return getOrder.handle(new GetOrderQuery(id));
    }
}
