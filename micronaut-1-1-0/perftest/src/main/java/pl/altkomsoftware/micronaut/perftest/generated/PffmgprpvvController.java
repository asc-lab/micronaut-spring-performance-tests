package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pffmgprpvv")
public class PffmgprpvvController {

    private final PffmgprpvvService pffmgprpvvService;

    public PffmgprpvvController(PffmgprpvvService pffmgprpvvService) {
        this.pffmgprpvvService = pffmgprpvvService;
    }

    @Get("/")
    public String index() {
        return pffmgprpvvService.getGreeting();
    }
}
