package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ktfqudbjil")
public class KtfqudbjilController {

    private final KtfqudbjilService ktfqudbjilService;

    public KtfqudbjilController(KtfqudbjilService ktfqudbjilService) {
        this.ktfqudbjilService = ktfqudbjilService;
    }

    @Get("/")
    public String index() {
        return ktfqudbjilService.getGreeting();
    }
}
