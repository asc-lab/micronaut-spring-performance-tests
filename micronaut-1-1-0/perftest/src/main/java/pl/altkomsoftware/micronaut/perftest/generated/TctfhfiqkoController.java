package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tctfhfiqko")
public class TctfhfiqkoController {

    private final TctfhfiqkoService tctfhfiqkoService;

    public TctfhfiqkoController(TctfhfiqkoService tctfhfiqkoService) {
        this.tctfhfiqkoService = tctfhfiqkoService;
    }

    @Get("/")
    public String index() {
        return tctfhfiqkoService.getGreeting();
    }
}
