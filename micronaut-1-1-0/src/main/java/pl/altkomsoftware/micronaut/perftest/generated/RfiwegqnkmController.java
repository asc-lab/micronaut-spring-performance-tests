package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rfiwegqnkm")
public class RfiwegqnkmController {

    private final RfiwegqnkmService rfiwegqnkmService;

    public RfiwegqnkmController(RfiwegqnkmService rfiwegqnkmService) {
        this.rfiwegqnkmService = rfiwegqnkmService;
    }

    @Get("/")
    public String index() {
        return rfiwegqnkmService.getGreeting();
    }
}
