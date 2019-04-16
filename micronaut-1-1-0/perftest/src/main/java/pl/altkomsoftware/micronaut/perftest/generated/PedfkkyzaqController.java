package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pedfkkyzaq")
public class PedfkkyzaqController {

    private final PedfkkyzaqService pedfkkyzaqService;

    public PedfkkyzaqController(PedfkkyzaqService pedfkkyzaqService) {
        this.pedfkkyzaqService = pedfkkyzaqService;
    }

    @Get("/")
    public String index() {
        return pedfkkyzaqService.getGreeting();
    }
}
