package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dhljdzhhci")
public class DhljdzhhciController {

    private final DhljdzhhciService dhljdzhhciService;

    public DhljdzhhciController(DhljdzhhciService dhljdzhhciService) {
        this.dhljdzhhciService = dhljdzhhciService;
    }

    @Get("/")
    public String index() {
        return dhljdzhhciService.getGreeting();
    }
}
