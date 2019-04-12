package com.asc.lab.perftest.order.api;

import com.asc.lab.perftest.order.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order/")
@RequiredArgsConstructor
public class OrderController {
    private final CreateOrderHandler createOrder;
    private final AddProductToOrderHandler addProductToOrder;
    private final SubmitOrderHandler submitOrder;
    private final ApproveOrderHandler approveOrder;
    private final RejectOrderHandler rejectOrder;
    private final GetOrderHandler getOrder;

    @PostMapping
    public OrderDto create(@RequestBody CreateOrderCommand cmd){
        return createOrder.handle(cmd);
    }

    @PostMapping("addProduct")
    public OrderDto addProduct(@RequestBody AddProductToOrderCommand cmd){
        return addProductToOrder.handle(cmd);
    }

    @PostMapping("submit")
    public OrderDto submit(@RequestBody SubmitOrderCommand cmd){
        return submitOrder.handle(cmd);
    }

    @PostMapping("approve")
    public OrderDto approve(@RequestBody ApproveOrderCommand cmd){
        return approveOrder.handle(cmd);
    }

    @PostMapping("reject")
    public OrderDto reject(@RequestBody RejectOrderCommand cmd){
        return rejectOrder.handle(cmd);
    }

    @GetMapping("{id}")
    public OrderDto getById(@PathVariable("id") Long id){
        return getOrder.handle(new GetOrderQuery(id));
    }
}
