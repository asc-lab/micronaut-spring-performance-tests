package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uwlruoqrrf")
public class UwlruoqrrfController {

    private final UwlruoqrrfService uwlruoqrrfService;

    public UwlruoqrrfController(UwlruoqrrfService uwlruoqrrfService) {
        this.uwlruoqrrfService = uwlruoqrrfService;
    }

    @Get("/")
    public String index() {
        return uwlruoqrrfService.getGreeting();
    }
}
