package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hebkbsbgdn")
public class HebkbsbgdnController {

    private final HebkbsbgdnService hebkbsbgdnService;

    public HebkbsbgdnController(HebkbsbgdnService hebkbsbgdnService) {
        this.hebkbsbgdnService = hebkbsbgdnService;
    }

    @Get("/")
    public String index() {
        return hebkbsbgdnService.getGreeting();
    }
}
