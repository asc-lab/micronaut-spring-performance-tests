package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ouywjadquc")
public class OuywjadqucController {

    private final OuywjadqucService ouywjadqucService;

    public OuywjadqucController(OuywjadqucService ouywjadqucService) {
        this.ouywjadqucService = ouywjadqucService;
    }

    @Get("/")
    public String index() {
        return ouywjadqucService.getGreeting();
    }
}
