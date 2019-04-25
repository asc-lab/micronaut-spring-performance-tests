package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sasnuvzzzg")
public class SasnuvzzzgController {

    private final SasnuvzzzgService sasnuvzzzgService;

    public SasnuvzzzgController(SasnuvzzzgService sasnuvzzzgService) {
        this.sasnuvzzzgService = sasnuvzzzgService;
    }

    @Get("/")
    public String index() {
        return sasnuvzzzgService.getGreeting();
    }
}
