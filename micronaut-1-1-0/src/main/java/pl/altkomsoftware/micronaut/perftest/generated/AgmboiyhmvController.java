package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/agmboiyhmv")
public class AgmboiyhmvController {

    private final AgmboiyhmvService agmboiyhmvService;

    public AgmboiyhmvController(AgmboiyhmvService agmboiyhmvService) {
        this.agmboiyhmvService = agmboiyhmvService;
    }

    @Get("/")
    public String index() {
        return agmboiyhmvService.getGreeting();
    }
}
