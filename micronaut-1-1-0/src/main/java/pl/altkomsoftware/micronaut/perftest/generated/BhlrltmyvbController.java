package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bhlrltmyvb")
public class BhlrltmyvbController {

    private final BhlrltmyvbService bhlrltmyvbService;

    public BhlrltmyvbController(BhlrltmyvbService bhlrltmyvbService) {
        this.bhlrltmyvbService = bhlrltmyvbService;
    }

    @Get("/")
    public String index() {
        return bhlrltmyvbService.getGreeting();
    }
}
