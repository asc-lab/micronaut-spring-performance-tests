package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jdtfenzidv")
public class JdtfenzidvController {

    private final JdtfenzidvService jdtfenzidvService;

    public JdtfenzidvController(JdtfenzidvService jdtfenzidvService) {
        this.jdtfenzidvService = jdtfenzidvService;
    }

    @Get("/")
    public String index() {
        return jdtfenzidvService.getGreeting();
    }
}
