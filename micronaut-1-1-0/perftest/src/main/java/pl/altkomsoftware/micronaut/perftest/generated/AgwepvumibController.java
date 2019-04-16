package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/agwepvumib")
public class AgwepvumibController {

    private final AgwepvumibService agwepvumibService;

    public AgwepvumibController(AgwepvumibService agwepvumibService) {
        this.agwepvumibService = agwepvumibService;
    }

    @Get("/")
    public String index() {
        return agwepvumibService.getGreeting();
    }
}
