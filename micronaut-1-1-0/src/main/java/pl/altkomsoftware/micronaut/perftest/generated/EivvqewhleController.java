package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eivvqewhle")
public class EivvqewhleController {

    private final EivvqewhleService eivvqewhleService;

    public EivvqewhleController(EivvqewhleService eivvqewhleService) {
        this.eivvqewhleService = eivvqewhleService;
    }

    @Get("/")
    public String index() {
        return eivvqewhleService.getGreeting();
    }
}
