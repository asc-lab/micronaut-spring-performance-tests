package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jxnbsclocv")
public class JxnbsclocvController {

    private final JxnbsclocvService jxnbsclocvService;

    public JxnbsclocvController(JxnbsclocvService jxnbsclocvService) {
        this.jxnbsclocvService = jxnbsclocvService;
    }

    @Get("/")
    public String index() {
        return jxnbsclocvService.getGreeting();
    }
}
