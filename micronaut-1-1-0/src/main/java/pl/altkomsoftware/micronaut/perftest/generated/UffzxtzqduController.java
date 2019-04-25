package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uffzxtzqdu")
public class UffzxtzqduController {

    private final UffzxtzqduService uffzxtzqduService;

    public UffzxtzqduController(UffzxtzqduService uffzxtzqduService) {
        this.uffzxtzqduService = uffzxtzqduService;
    }

    @Get("/")
    public String index() {
        return uffzxtzqduService.getGreeting();
    }
}
