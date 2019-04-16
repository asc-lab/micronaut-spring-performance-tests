package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wivhwfsfpd")
public class WivhwfsfpdController {

    private final WivhwfsfpdService wivhwfsfpdService;

    public WivhwfsfpdController(WivhwfsfpdService wivhwfsfpdService) {
        this.wivhwfsfpdService = wivhwfsfpdService;
    }

    @Get("/")
    public String index() {
        return wivhwfsfpdService.getGreeting();
    }
}
