package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wcpjbgnaui")
public class WcpjbgnauiController {

    private final WcpjbgnauiService wcpjbgnauiService;

    public WcpjbgnauiController(WcpjbgnauiService wcpjbgnauiService) {
        this.wcpjbgnauiService = wcpjbgnauiService;
    }

    @Get("/")
    public String index() {
        return wcpjbgnauiService.getGreeting();
    }
}
