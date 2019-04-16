package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cawrislnnb")
public class CawrislnnbController {

    private final CawrislnnbService cawrislnnbService;

    public CawrislnnbController(CawrislnnbService cawrislnnbService) {
        this.cawrislnnbService = cawrislnnbService;
    }

    @Get("/")
    public String index() {
        return cawrislnnbService.getGreeting();
    }
}
