package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rfuwxwfnsh")
public class RfuwxwfnshController {

    private final RfuwxwfnshService rfuwxwfnshService;

    public RfuwxwfnshController(RfuwxwfnshService rfuwxwfnshService) {
        this.rfuwxwfnshService = rfuwxwfnshService;
    }

    @Get("/")
    public String index() {
        return rfuwxwfnshService.getGreeting();
    }
}
