package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/laaspgrwkf")
public class LaaspgrwkfController {

    private final LaaspgrwkfService laaspgrwkfService;

    public LaaspgrwkfController(LaaspgrwkfService laaspgrwkfService) {
        this.laaspgrwkfService = laaspgrwkfService;
    }

    @Get("/")
    public String index() {
        return laaspgrwkfService.getGreeting();
    }
}
