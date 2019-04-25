package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fqlbykrwrn")
public class FqlbykrwrnController {

    private final FqlbykrwrnService fqlbykrwrnService;

    public FqlbykrwrnController(FqlbykrwrnService fqlbykrwrnService) {
        this.fqlbykrwrnService = fqlbykrwrnService;
    }

    @Get("/")
    public String index() {
        return fqlbykrwrnService.getGreeting();
    }
}
