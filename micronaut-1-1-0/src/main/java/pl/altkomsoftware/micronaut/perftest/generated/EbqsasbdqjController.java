package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ebqsasbdqj")
public class EbqsasbdqjController {

    private final EbqsasbdqjService ebqsasbdqjService;

    public EbqsasbdqjController(EbqsasbdqjService ebqsasbdqjService) {
        this.ebqsasbdqjService = ebqsasbdqjService;
    }

    @Get("/")
    public String index() {
        return ebqsasbdqjService.getGreeting();
    }
}
