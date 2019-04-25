package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kchjzphvxl")
public class KchjzphvxlController {

    private final KchjzphvxlService kchjzphvxlService;

    public KchjzphvxlController(KchjzphvxlService kchjzphvxlService) {
        this.kchjzphvxlService = kchjzphvxlService;
    }

    @Get("/")
    public String index() {
        return kchjzphvxlService.getGreeting();
    }
}
