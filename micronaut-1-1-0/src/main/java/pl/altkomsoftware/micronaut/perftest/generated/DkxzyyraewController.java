package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dkxzyyraew")
public class DkxzyyraewController {

    private final DkxzyyraewService dkxzyyraewService;

    public DkxzyyraewController(DkxzyyraewService dkxzyyraewService) {
        this.dkxzyyraewService = dkxzyyraewService;
    }

    @Get("/")
    public String index() {
        return dkxzyyraewService.getGreeting();
    }
}
