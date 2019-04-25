package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jhamtacklr")
public class JhamtacklrController {

    private final JhamtacklrService jhamtacklrService;

    public JhamtacklrController(JhamtacklrService jhamtacklrService) {
        this.jhamtacklrService = jhamtacklrService;
    }

    @Get("/")
    public String index() {
        return jhamtacklrService.getGreeting();
    }
}
