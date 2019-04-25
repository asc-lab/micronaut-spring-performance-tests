package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zzjtjvihae")
public class ZzjtjvihaeController {

    private final ZzjtjvihaeService zzjtjvihaeService;

    public ZzjtjvihaeController(ZzjtjvihaeService zzjtjvihaeService) {
        this.zzjtjvihaeService = zzjtjvihaeService;
    }

    @Get("/")
    public String index() {
        return zzjtjvihaeService.getGreeting();
    }
}
