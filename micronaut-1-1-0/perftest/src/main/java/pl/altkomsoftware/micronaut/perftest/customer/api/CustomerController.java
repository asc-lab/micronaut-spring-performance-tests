package pl.altkomsoftware.micronaut.perftest.customer.api;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import lombok.RequiredArgsConstructor;
import pl.altkomsoftware.micronaut.perftest.customer.ChangeAddressHandler;
import pl.altkomsoftware.micronaut.perftest.customer.CreateCustomerHandler;
import pl.altkomsoftware.micronaut.perftest.customer.GetCustomerHandler;
import pl.altkomsoftware.micronaut.perftest.customer.MakeCustomerVipHandler;

@Controller("/api/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CreateCustomerHandler createCustomer;
    private final ChangeAddressHandler changeAddress;
    private final MakeCustomerVipHandler makeCustomerVip;
    private final GetCustomerHandler getCustomer;

    @Post
    public CustomerDto create(@Body CreateCustomerCommand cmd){
        return createCustomer.handle(cmd);
    }

    @Post("/changeAddress")
    public CustomerDto changeAddress(@Body ChangeCustomerAddressCommand cmd){
        return changeAddress.handle(cmd);
    }

    @Post("/makeVip")
    public CustomerDto makeVip(@Body MakeCustomerVipCommand cmd){
        return makeCustomerVip.handle(cmd);
    }


    @Get("/{name}")
    public CustomerDto getCustomerByName(String name){ return getCustomer.handle(new GetCustomerQuery(name)); }
}
