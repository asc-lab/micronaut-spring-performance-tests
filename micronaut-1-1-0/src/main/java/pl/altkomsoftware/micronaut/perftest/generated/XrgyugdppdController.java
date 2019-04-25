package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xrgyugdppd")
public class XrgyugdppdController {

    private final XrgyugdppdService xrgyugdppdService;

    public XrgyugdppdController(XrgyugdppdService xrgyugdppdService) {
        this.xrgyugdppdService = xrgyugdppdService;
    }

    @Get("/")
    public String index() {
        return xrgyugdppdService.getGreeting();
    }
}
