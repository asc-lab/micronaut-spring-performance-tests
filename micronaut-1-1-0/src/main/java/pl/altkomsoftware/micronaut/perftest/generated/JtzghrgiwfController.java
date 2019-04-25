package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jtzghrgiwf")
public class JtzghrgiwfController {

    private final JtzghrgiwfService jtzghrgiwfService;

    public JtzghrgiwfController(JtzghrgiwfService jtzghrgiwfService) {
        this.jtzghrgiwfService = jtzghrgiwfService;
    }

    @Get("/")
    public String index() {
        return jtzghrgiwfService.getGreeting();
    }
}
