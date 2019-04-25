package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zpjafinczc")
public class ZpjafinczcController {

    private final ZpjafinczcService zpjafinczcService;

    public ZpjafinczcController(ZpjafinczcService zpjafinczcService) {
        this.zpjafinczcService = zpjafinczcService;
    }

    @Get("/")
    public String index() {
        return zpjafinczcService.getGreeting();
    }
}
