package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/apivfskjth")
public class ApivfskjthController {

    private final ApivfskjthService apivfskjthService;

    public ApivfskjthController(ApivfskjthService apivfskjthService) {
        this.apivfskjthService = apivfskjthService;
    }

    @Get("/")
    public String index() {
        return apivfskjthService.getGreeting();
    }
}
