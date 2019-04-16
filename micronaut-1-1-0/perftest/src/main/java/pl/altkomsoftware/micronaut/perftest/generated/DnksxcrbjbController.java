package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dnksxcrbjb")
public class DnksxcrbjbController {

    private final DnksxcrbjbService dnksxcrbjbService;

    public DnksxcrbjbController(DnksxcrbjbService dnksxcrbjbService) {
        this.dnksxcrbjbService = dnksxcrbjbService;
    }

    @Get("/")
    public String index() {
        return dnksxcrbjbService.getGreeting();
    }
}
