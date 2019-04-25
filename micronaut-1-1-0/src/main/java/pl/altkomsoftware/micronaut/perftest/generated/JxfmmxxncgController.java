package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jxfmmxxncg")
public class JxfmmxxncgController {

    private final JxfmmxxncgService jxfmmxxncgService;

    public JxfmmxxncgController(JxfmmxxncgService jxfmmxxncgService) {
        this.jxfmmxxncgService = jxfmmxxncgService;
    }

    @Get("/")
    public String index() {
        return jxfmmxxncgService.getGreeting();
    }
}
