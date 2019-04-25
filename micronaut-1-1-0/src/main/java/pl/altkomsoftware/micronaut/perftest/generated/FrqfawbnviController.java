package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/frqfawbnvi")
public class FrqfawbnviController {

    private final FrqfawbnviService frqfawbnviService;

    public FrqfawbnviController(FrqfawbnviService frqfawbnviService) {
        this.frqfawbnviService = frqfawbnviService;
    }

    @Get("/")
    public String index() {
        return frqfawbnviService.getGreeting();
    }
}
