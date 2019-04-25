package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zlhjhvrgel")
public class ZlhjhvrgelController {

    private final ZlhjhvrgelService zlhjhvrgelService;

    public ZlhjhvrgelController(ZlhjhvrgelService zlhjhvrgelService) {
        this.zlhjhvrgelService = zlhjhvrgelService;
    }

    @Get("/")
    public String index() {
        return zlhjhvrgelService.getGreeting();
    }
}
