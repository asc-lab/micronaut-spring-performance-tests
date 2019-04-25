package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/josaobbtle")
public class JosaobbtleController {

    private final JosaobbtleService josaobbtleService;

    public JosaobbtleController(JosaobbtleService josaobbtleService) {
        this.josaobbtleService = josaobbtleService;
    }

    @Get("/")
    public String index() {
        return josaobbtleService.getGreeting();
    }
}
