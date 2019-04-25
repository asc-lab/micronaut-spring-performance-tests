package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sauwroxdrb")
public class SauwroxdrbController {

    private final SauwroxdrbService sauwroxdrbService;

    public SauwroxdrbController(SauwroxdrbService sauwroxdrbService) {
        this.sauwroxdrbService = sauwroxdrbService;
    }

    @Get("/")
    public String index() {
        return sauwroxdrbService.getGreeting();
    }
}
