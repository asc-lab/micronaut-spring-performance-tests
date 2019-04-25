package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jrigfnvffd")
public class JrigfnvffdController {

    private final JrigfnvffdService jrigfnvffdService;

    public JrigfnvffdController(JrigfnvffdService jrigfnvffdService) {
        this.jrigfnvffdService = jrigfnvffdService;
    }

    @Get("/")
    public String index() {
        return jrigfnvffdService.getGreeting();
    }
}
