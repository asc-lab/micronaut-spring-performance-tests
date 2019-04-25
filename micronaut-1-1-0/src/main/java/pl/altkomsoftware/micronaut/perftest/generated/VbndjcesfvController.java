package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vbndjcesfv")
public class VbndjcesfvController {

    private final VbndjcesfvService vbndjcesfvService;

    public VbndjcesfvController(VbndjcesfvService vbndjcesfvService) {
        this.vbndjcesfvService = vbndjcesfvService;
    }

    @Get("/")
    public String index() {
        return vbndjcesfvService.getGreeting();
    }
}
