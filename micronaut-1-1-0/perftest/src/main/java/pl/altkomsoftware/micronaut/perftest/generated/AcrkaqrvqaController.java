package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/acrkaqrvqa")
public class AcrkaqrvqaController {

    private final AcrkaqrvqaService acrkaqrvqaService;

    public AcrkaqrvqaController(AcrkaqrvqaService acrkaqrvqaService) {
        this.acrkaqrvqaService = acrkaqrvqaService;
    }

    @Get("/")
    public String index() {
        return acrkaqrvqaService.getGreeting();
    }
}
