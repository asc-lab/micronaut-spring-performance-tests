package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zmzzypzqcq")
public class ZmzzypzqcqController {

    private final ZmzzypzqcqService zmzzypzqcqService;

    public ZmzzypzqcqController(ZmzzypzqcqService zmzzypzqcqService) {
        this.zmzzypzqcqService = zmzzypzqcqService;
    }

    @Get("/")
    public String index() {
        return zmzzypzqcqService.getGreeting();
    }
}
