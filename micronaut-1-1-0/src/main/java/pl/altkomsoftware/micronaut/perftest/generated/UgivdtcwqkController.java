package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ugivdtcwqk")
public class UgivdtcwqkController {

    private final UgivdtcwqkService ugivdtcwqkService;

    public UgivdtcwqkController(UgivdtcwqkService ugivdtcwqkService) {
        this.ugivdtcwqkService = ugivdtcwqkService;
    }

    @Get("/")
    public String index() {
        return ugivdtcwqkService.getGreeting();
    }
}
