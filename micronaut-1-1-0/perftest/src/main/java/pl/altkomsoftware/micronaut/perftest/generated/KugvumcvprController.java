package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kugvumcvpr")
public class KugvumcvprController {

    private final KugvumcvprService kugvumcvprService;

    public KugvumcvprController(KugvumcvprService kugvumcvprService) {
        this.kugvumcvprService = kugvumcvprService;
    }

    @Get("/")
    public String index() {
        return kugvumcvprService.getGreeting();
    }
}
