package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xbsstcesiy")
public class XbsstcesiyController {

    private final XbsstcesiyService xbsstcesiyService;

    public XbsstcesiyController(XbsstcesiyService xbsstcesiyService) {
        this.xbsstcesiyService = xbsstcesiyService;
    }

    @Get("/")
    public String index() {
        return xbsstcesiyService.getGreeting();
    }
}
