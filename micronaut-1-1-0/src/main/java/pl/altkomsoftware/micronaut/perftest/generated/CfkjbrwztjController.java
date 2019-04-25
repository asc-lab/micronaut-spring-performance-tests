package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cfkjbrwztj")
public class CfkjbrwztjController {

    private final CfkjbrwztjService cfkjbrwztjService;

    public CfkjbrwztjController(CfkjbrwztjService cfkjbrwztjService) {
        this.cfkjbrwztjService = cfkjbrwztjService;
    }

    @Get("/")
    public String index() {
        return cfkjbrwztjService.getGreeting();
    }
}
