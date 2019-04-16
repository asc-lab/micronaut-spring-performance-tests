package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ugzvcybbev")
public class UgzvcybbevController {

    private final UgzvcybbevService ugzvcybbevService;

    public UgzvcybbevController(UgzvcybbevService ugzvcybbevService) {
        this.ugzvcybbevService = ugzvcybbevService;
    }

    @Get("/")
    public String index() {
        return ugzvcybbevService.getGreeting();
    }
}
