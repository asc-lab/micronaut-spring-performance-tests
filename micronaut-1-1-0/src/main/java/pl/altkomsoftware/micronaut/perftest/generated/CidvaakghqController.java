package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cidvaakghq")
public class CidvaakghqController {

    private final CidvaakghqService cidvaakghqService;

    public CidvaakghqController(CidvaakghqService cidvaakghqService) {
        this.cidvaakghqService = cidvaakghqService;
    }

    @Get("/")
    public String index() {
        return cidvaakghqService.getGreeting();
    }
}
