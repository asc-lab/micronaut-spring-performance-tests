package perftest.customer.api;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import lombok.RequiredArgsConstructor;
import perftest.customer.CreateCustomerHandler;
import perftest.customer.GetCustomerHandler;

@Controller("/api/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CreateCustomerHandler createCustomer;
    private final GetCustomerHandler getCustomer;

    @Post
    public CustomerDto create(@Body CreateCustomerCommand cmd){
        return createCustomer.handle(cmd);
    }

    @Get("/{name}")
    public CustomerDto getCustomerByName(String name){ return getCustomer.handle(new GetCustomerQuery(name)); }
}
