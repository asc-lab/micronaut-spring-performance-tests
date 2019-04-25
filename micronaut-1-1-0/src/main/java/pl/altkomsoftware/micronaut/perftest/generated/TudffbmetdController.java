package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tudffbmetd")
public class TudffbmetdController {

    private final TudffbmetdService tudffbmetdService;

    public TudffbmetdController(TudffbmetdService tudffbmetdService) {
        this.tudffbmetdService = tudffbmetdService;
    }

    @Get("/")
    public String index() {
        return tudffbmetdService.getGreeting();
    }
}
