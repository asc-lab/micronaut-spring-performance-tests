package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/arhbrkodhn")
public class ArhbrkodhnController {

    private final ArhbrkodhnService arhbrkodhnService;

    public ArhbrkodhnController(ArhbrkodhnService arhbrkodhnService) {
        this.arhbrkodhnService = arhbrkodhnService;
    }

    @Get("/")
    public String index() {
        return arhbrkodhnService.getGreeting();
    }
}
