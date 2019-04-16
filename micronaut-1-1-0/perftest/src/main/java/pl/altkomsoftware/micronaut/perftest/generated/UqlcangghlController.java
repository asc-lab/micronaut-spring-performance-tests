package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uqlcangghl")
public class UqlcangghlController {

    private final UqlcangghlService uqlcangghlService;

    public UqlcangghlController(UqlcangghlService uqlcangghlService) {
        this.uqlcangghlService = uqlcangghlService;
    }

    @Get("/")
    public String index() {
        return uqlcangghlService.getGreeting();
    }
}
