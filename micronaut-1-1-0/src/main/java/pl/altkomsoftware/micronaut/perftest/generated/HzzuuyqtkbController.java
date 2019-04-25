package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hzzuuyqtkb")
public class HzzuuyqtkbController {

    private final HzzuuyqtkbService hzzuuyqtkbService;

    public HzzuuyqtkbController(HzzuuyqtkbService hzzuuyqtkbService) {
        this.hzzuuyqtkbService = hzzuuyqtkbService;
    }

    @Get("/")
    public String index() {
        return hzzuuyqtkbService.getGreeting();
    }
}
