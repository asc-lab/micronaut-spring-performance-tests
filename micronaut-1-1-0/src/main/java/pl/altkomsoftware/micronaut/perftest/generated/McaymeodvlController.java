package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mcaymeodvl")
public class McaymeodvlController {

    private final McaymeodvlService mcaymeodvlService;

    public McaymeodvlController(McaymeodvlService mcaymeodvlService) {
        this.mcaymeodvlService = mcaymeodvlService;
    }

    @Get("/")
    public String index() {
        return mcaymeodvlService.getGreeting();
    }
}
