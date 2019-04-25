package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/spgxswnunq")
public class SpgxswnunqController {

    private final SpgxswnunqService spgxswnunqService;

    public SpgxswnunqController(SpgxswnunqService spgxswnunqService) {
        this.spgxswnunqService = spgxswnunqService;
    }

    @Get("/")
    public String index() {
        return spgxswnunqService.getGreeting();
    }
}
