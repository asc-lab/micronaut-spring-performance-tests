package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/coilqayopb")
public class CoilqayopbController {

    private final CoilqayopbService coilqayopbService;

    public CoilqayopbController(CoilqayopbService coilqayopbService) {
        this.coilqayopbService = coilqayopbService;
    }

    @Get("/")
    public String index() {
        return coilqayopbService.getGreeting();
    }
}
