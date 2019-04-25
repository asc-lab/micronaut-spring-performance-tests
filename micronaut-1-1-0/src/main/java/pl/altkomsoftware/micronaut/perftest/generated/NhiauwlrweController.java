package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nhiauwlrwe")
public class NhiauwlrweController {

    private final NhiauwlrweService nhiauwlrweService;

    public NhiauwlrweController(NhiauwlrweService nhiauwlrweService) {
        this.nhiauwlrweService = nhiauwlrweService;
    }

    @Get("/")
    public String index() {
        return nhiauwlrweService.getGreeting();
    }
}
