package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/htqxwehfpc")
public class HtqxwehfpcController {

    private final HtqxwehfpcService htqxwehfpcService;

    public HtqxwehfpcController(HtqxwehfpcService htqxwehfpcService) {
        this.htqxwehfpcService = htqxwehfpcService;
    }

    @Get("/")
    public String index() {
        return htqxwehfpcService.getGreeting();
    }
}
