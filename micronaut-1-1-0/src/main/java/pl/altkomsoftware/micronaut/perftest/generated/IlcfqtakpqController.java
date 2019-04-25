package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ilcfqtakpq")
public class IlcfqtakpqController {

    private final IlcfqtakpqService ilcfqtakpqService;

    public IlcfqtakpqController(IlcfqtakpqService ilcfqtakpqService) {
        this.ilcfqtakpqService = ilcfqtakpqService;
    }

    @Get("/")
    public String index() {
        return ilcfqtakpqService.getGreeting();
    }
}
