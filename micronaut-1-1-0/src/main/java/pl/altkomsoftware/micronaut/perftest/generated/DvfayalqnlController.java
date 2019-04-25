package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dvfayalqnl")
public class DvfayalqnlController {

    private final DvfayalqnlService dvfayalqnlService;

    public DvfayalqnlController(DvfayalqnlService dvfayalqnlService) {
        this.dvfayalqnlService = dvfayalqnlService;
    }

    @Get("/")
    public String index() {
        return dvfayalqnlService.getGreeting();
    }
}
