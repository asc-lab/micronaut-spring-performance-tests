package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ahontaocqf")
public class AhontaocqfController {

    private final AhontaocqfService ahontaocqfService;

    public AhontaocqfController(AhontaocqfService ahontaocqfService) {
        this.ahontaocqfService = ahontaocqfService;
    }

    @Get("/")
    public String index() {
        return ahontaocqfService.getGreeting();
    }
}
