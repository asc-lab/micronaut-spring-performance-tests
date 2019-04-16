package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hmniltaezv")
public class HmniltaezvController {

    private final HmniltaezvService hmniltaezvService;

    public HmniltaezvController(HmniltaezvService hmniltaezvService) {
        this.hmniltaezvService = hmniltaezvService;
    }

    @Get("/")
    public String index() {
        return hmniltaezvService.getGreeting();
    }
}
