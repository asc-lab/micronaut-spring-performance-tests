package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/aymkwfmnxj")
public class AymkwfmnxjController {

    private final AymkwfmnxjService aymkwfmnxjService;

    public AymkwfmnxjController(AymkwfmnxjService aymkwfmnxjService) {
        this.aymkwfmnxjService = aymkwfmnxjService;
    }

    @Get("/")
    public String index() {
        return aymkwfmnxjService.getGreeting();
    }
}
