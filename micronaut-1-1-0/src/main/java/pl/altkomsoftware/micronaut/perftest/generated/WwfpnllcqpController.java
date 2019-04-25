package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wwfpnllcqp")
public class WwfpnllcqpController {

    private final WwfpnllcqpService wwfpnllcqpService;

    public WwfpnllcqpController(WwfpnllcqpService wwfpnllcqpService) {
        this.wwfpnllcqpService = wwfpnllcqpService;
    }

    @Get("/")
    public String index() {
        return wwfpnllcqpService.getGreeting();
    }
}
