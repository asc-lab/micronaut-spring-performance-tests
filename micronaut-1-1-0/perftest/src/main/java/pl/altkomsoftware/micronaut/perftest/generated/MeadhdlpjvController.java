package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/meadhdlpjv")
public class MeadhdlpjvController {

    private final MeadhdlpjvService meadhdlpjvService;

    public MeadhdlpjvController(MeadhdlpjvService meadhdlpjvService) {
        this.meadhdlpjvService = meadhdlpjvService;
    }

    @Get("/")
    public String index() {
        return meadhdlpjvService.getGreeting();
    }
}
