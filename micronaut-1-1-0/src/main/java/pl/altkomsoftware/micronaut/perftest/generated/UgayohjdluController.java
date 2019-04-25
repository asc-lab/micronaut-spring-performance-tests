package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ugayohjdlu")
public class UgayohjdluController {

    private final UgayohjdluService ugayohjdluService;

    public UgayohjdluController(UgayohjdluService ugayohjdluService) {
        this.ugayohjdluService = ugayohjdluService;
    }

    @Get("/")
    public String index() {
        return ugayohjdluService.getGreeting();
    }
}
