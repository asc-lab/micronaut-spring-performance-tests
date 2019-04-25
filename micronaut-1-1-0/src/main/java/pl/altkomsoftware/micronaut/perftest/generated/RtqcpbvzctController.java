package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rtqcpbvzct")
public class RtqcpbvzctController {

    private final RtqcpbvzctService rtqcpbvzctService;

    public RtqcpbvzctController(RtqcpbvzctService rtqcpbvzctService) {
        this.rtqcpbvzctService = rtqcpbvzctService;
    }

    @Get("/")
    public String index() {
        return rtqcpbvzctService.getGreeting();
    }
}
