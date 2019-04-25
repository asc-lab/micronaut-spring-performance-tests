package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wqosezxwmq")
public class WqosezxwmqController {

    private final WqosezxwmqService wqosezxwmqService;

    public WqosezxwmqController(WqosezxwmqService wqosezxwmqService) {
        this.wqosezxwmqService = wqosezxwmqService;
    }

    @Get("/")
    public String index() {
        return wqosezxwmqService.getGreeting();
    }
}
