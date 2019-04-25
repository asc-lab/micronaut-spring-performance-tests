package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fkpisgdvav")
public class FkpisgdvavController {

    private final FkpisgdvavService fkpisgdvavService;

    public FkpisgdvavController(FkpisgdvavService fkpisgdvavService) {
        this.fkpisgdvavService = fkpisgdvavService;
    }

    @Get("/")
    public String index() {
        return fkpisgdvavService.getGreeting();
    }
}
