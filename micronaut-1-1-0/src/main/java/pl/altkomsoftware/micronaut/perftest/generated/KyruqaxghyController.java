package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kyruqaxghy")
public class KyruqaxghyController {

    private final KyruqaxghyService kyruqaxghyService;

    public KyruqaxghyController(KyruqaxghyService kyruqaxghyService) {
        this.kyruqaxghyService = kyruqaxghyService;
    }

    @Get("/")
    public String index() {
        return kyruqaxghyService.getGreeting();
    }
}
