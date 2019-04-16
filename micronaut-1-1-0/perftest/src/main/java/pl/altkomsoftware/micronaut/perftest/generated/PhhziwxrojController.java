package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/phhziwxroj")
public class PhhziwxrojController {

    private final PhhziwxrojService phhziwxrojService;

    public PhhziwxrojController(PhhziwxrojService phhziwxrojService) {
        this.phhziwxrojService = phhziwxrojService;
    }

    @Get("/")
    public String index() {
        return phhziwxrojService.getGreeting();
    }
}
