package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uaoumipcjb")
public class UaoumipcjbController {

    private final UaoumipcjbService uaoumipcjbService;

    public UaoumipcjbController(UaoumipcjbService uaoumipcjbService) {
        this.uaoumipcjbService = uaoumipcjbService;
    }

    @Get("/")
    public String index() {
        return uaoumipcjbService.getGreeting();
    }
}
