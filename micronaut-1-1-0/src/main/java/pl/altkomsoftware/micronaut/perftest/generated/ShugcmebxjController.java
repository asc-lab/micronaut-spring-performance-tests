package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/shugcmebxj")
public class ShugcmebxjController {

    private final ShugcmebxjService shugcmebxjService;

    public ShugcmebxjController(ShugcmebxjService shugcmebxjService) {
        this.shugcmebxjService = shugcmebxjService;
    }

    @Get("/")
    public String index() {
        return shugcmebxjService.getGreeting();
    }
}
