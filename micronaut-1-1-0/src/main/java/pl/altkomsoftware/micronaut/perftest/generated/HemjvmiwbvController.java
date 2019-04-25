package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hemjvmiwbv")
public class HemjvmiwbvController {

    private final HemjvmiwbvService hemjvmiwbvService;

    public HemjvmiwbvController(HemjvmiwbvService hemjvmiwbvService) {
        this.hemjvmiwbvService = hemjvmiwbvService;
    }

    @Get("/")
    public String index() {
        return hemjvmiwbvService.getGreeting();
    }
}
