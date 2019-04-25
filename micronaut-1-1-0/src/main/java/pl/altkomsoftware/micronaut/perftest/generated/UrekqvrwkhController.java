package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/urekqvrwkh")
public class UrekqvrwkhController {

    private final UrekqvrwkhService urekqvrwkhService;

    public UrekqvrwkhController(UrekqvrwkhService urekqvrwkhService) {
        this.urekqvrwkhService = urekqvrwkhService;
    }

    @Get("/")
    public String index() {
        return urekqvrwkhService.getGreeting();
    }
}
