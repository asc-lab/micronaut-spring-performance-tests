package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kshbmdgerx")
public class KshbmdgerxController {

    private final KshbmdgerxService kshbmdgerxService;

    public KshbmdgerxController(KshbmdgerxService kshbmdgerxService) {
        this.kshbmdgerxService = kshbmdgerxService;
    }

    @Get("/")
    public String index() {
        return kshbmdgerxService.getGreeting();
    }
}
