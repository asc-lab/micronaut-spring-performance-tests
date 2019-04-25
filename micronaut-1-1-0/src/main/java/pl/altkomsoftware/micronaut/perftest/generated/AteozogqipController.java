package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ateozogqip")
public class AteozogqipController {

    private final AteozogqipService ateozogqipService;

    public AteozogqipController(AteozogqipService ateozogqipService) {
        this.ateozogqipService = ateozogqipService;
    }

    @Get("/")
    public String index() {
        return ateozogqipService.getGreeting();
    }
}
