package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ewqhvunoca")
public class EwqhvunocaController {

    private final EwqhvunocaService ewqhvunocaService;

    public EwqhvunocaController(EwqhvunocaService ewqhvunocaService) {
        this.ewqhvunocaService = ewqhvunocaService;
    }

    @Get("/")
    public String index() {
        return ewqhvunocaService.getGreeting();
    }
}
