package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zpkuumvwjj")
public class ZpkuumvwjjController {

    private final ZpkuumvwjjService zpkuumvwjjService;

    public ZpkuumvwjjController(ZpkuumvwjjService zpkuumvwjjService) {
        this.zpkuumvwjjService = zpkuumvwjjService;
    }

    @Get("/")
    public String index() {
        return zpkuumvwjjService.getGreeting();
    }
}
