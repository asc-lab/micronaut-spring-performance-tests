package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xricsemqfz")
public class XricsemqfzController {

    private final XricsemqfzService xricsemqfzService;

    public XricsemqfzController(XricsemqfzService xricsemqfzService) {
        this.xricsemqfzService = xricsemqfzService;
    }

    @Get("/")
    public String index() {
        return xricsemqfzService.getGreeting();
    }
}
