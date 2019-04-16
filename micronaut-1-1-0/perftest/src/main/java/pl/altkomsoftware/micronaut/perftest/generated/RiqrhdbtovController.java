package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/riqrhdbtov")
public class RiqrhdbtovController {

    private final RiqrhdbtovService riqrhdbtovService;

    public RiqrhdbtovController(RiqrhdbtovService riqrhdbtovService) {
        this.riqrhdbtovService = riqrhdbtovService;
    }

    @Get("/")
    public String index() {
        return riqrhdbtovService.getGreeting();
    }
}
