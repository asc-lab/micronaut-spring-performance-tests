package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gyynoorfjn")
public class GyynoorfjnController {

    private final GyynoorfjnService gyynoorfjnService;

    public GyynoorfjnController(GyynoorfjnService gyynoorfjnService) {
        this.gyynoorfjnService = gyynoorfjnService;
    }

    @Get("/")
    public String index() {
        return gyynoorfjnService.getGreeting();
    }
}
