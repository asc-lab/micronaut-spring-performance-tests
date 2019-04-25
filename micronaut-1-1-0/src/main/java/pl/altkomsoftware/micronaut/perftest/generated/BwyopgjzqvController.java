package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bwyopgjzqv")
public class BwyopgjzqvController {

    private final BwyopgjzqvService bwyopgjzqvService;

    public BwyopgjzqvController(BwyopgjzqvService bwyopgjzqvService) {
        this.bwyopgjzqvService = bwyopgjzqvService;
    }

    @Get("/")
    public String index() {
        return bwyopgjzqvService.getGreeting();
    }
}
