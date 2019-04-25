package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/whjgioijzk")
public class WhjgioijzkController {

    private final WhjgioijzkService whjgioijzkService;

    public WhjgioijzkController(WhjgioijzkService whjgioijzkService) {
        this.whjgioijzkService = whjgioijzkService;
    }

    @Get("/")
    public String index() {
        return whjgioijzkService.getGreeting();
    }
}
