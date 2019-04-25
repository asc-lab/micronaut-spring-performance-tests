package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/biwxkdaalc")
public class BiwxkdaalcController {

    private final BiwxkdaalcService biwxkdaalcService;

    public BiwxkdaalcController(BiwxkdaalcService biwxkdaalcService) {
        this.biwxkdaalcService = biwxkdaalcService;
    }

    @Get("/")
    public String index() {
        return biwxkdaalcService.getGreeting();
    }
}
