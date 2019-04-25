package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/akhxeopopq")
public class AkhxeopopqController {

    private final AkhxeopopqService akhxeopopqService;

    public AkhxeopopqController(AkhxeopopqService akhxeopopqService) {
        this.akhxeopopqService = akhxeopopqService;
    }

    @Get("/")
    public String index() {
        return akhxeopopqService.getGreeting();
    }
}
