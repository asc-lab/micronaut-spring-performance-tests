package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uyryqhieqw")
public class UyryqhieqwController {

    private final UyryqhieqwService uyryqhieqwService;

    public UyryqhieqwController(UyryqhieqwService uyryqhieqwService) {
        this.uyryqhieqwService = uyryqhieqwService;
    }

    @Get("/")
    public String index() {
        return uyryqhieqwService.getGreeting();
    }
}
