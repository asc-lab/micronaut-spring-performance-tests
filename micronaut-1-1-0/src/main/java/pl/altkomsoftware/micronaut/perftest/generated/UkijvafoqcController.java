package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ukijvafoqc")
public class UkijvafoqcController {

    private final UkijvafoqcService ukijvafoqcService;

    public UkijvafoqcController(UkijvafoqcService ukijvafoqcService) {
        this.ukijvafoqcService = ukijvafoqcService;
    }

    @Get("/")
    public String index() {
        return ukijvafoqcService.getGreeting();
    }
}
