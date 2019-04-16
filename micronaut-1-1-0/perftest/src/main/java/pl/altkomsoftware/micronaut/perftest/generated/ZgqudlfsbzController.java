package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zgqudlfsbz")
public class ZgqudlfsbzController {

    private final ZgqudlfsbzService zgqudlfsbzService;

    public ZgqudlfsbzController(ZgqudlfsbzService zgqudlfsbzService) {
        this.zgqudlfsbzService = zgqudlfsbzService;
    }

    @Get("/")
    public String index() {
        return zgqudlfsbzService.getGreeting();
    }
}
