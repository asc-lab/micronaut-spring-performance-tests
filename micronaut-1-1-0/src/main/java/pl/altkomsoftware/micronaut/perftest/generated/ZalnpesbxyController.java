package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zalnpesbxy")
public class ZalnpesbxyController {

    private final ZalnpesbxyService zalnpesbxyService;

    public ZalnpesbxyController(ZalnpesbxyService zalnpesbxyService) {
        this.zalnpesbxyService = zalnpesbxyService;
    }

    @Get("/")
    public String index() {
        return zalnpesbxyService.getGreeting();
    }
}
