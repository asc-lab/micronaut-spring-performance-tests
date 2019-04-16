package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pjkwuslcbc")
public class PjkwuslcbcController {

    private final PjkwuslcbcService pjkwuslcbcService;

    public PjkwuslcbcController(PjkwuslcbcService pjkwuslcbcService) {
        this.pjkwuslcbcService = pjkwuslcbcService;
    }

    @Get("/")
    public String index() {
        return pjkwuslcbcService.getGreeting();
    }
}
