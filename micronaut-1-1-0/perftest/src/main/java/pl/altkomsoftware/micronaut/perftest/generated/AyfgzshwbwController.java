package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ayfgzshwbw")
public class AyfgzshwbwController {

    private final AyfgzshwbwService ayfgzshwbwService;

    public AyfgzshwbwController(AyfgzshwbwService ayfgzshwbwService) {
        this.ayfgzshwbwService = ayfgzshwbwService;
    }

    @Get("/")
    public String index() {
        return ayfgzshwbwService.getGreeting();
    }
}
