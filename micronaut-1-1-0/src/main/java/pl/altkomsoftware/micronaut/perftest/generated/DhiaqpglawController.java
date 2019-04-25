package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dhiaqpglaw")
public class DhiaqpglawController {

    private final DhiaqpglawService dhiaqpglawService;

    public DhiaqpglawController(DhiaqpglawService dhiaqpglawService) {
        this.dhiaqpglawService = dhiaqpglawService;
    }

    @Get("/")
    public String index() {
        return dhiaqpglawService.getGreeting();
    }
}
