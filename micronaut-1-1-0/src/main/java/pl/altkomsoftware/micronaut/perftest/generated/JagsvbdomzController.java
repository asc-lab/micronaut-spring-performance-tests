package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jagsvbdomz")
public class JagsvbdomzController {

    private final JagsvbdomzService jagsvbdomzService;

    public JagsvbdomzController(JagsvbdomzService jagsvbdomzService) {
        this.jagsvbdomzService = jagsvbdomzService;
    }

    @Get("/")
    public String index() {
        return jagsvbdomzService.getGreeting();
    }
}
