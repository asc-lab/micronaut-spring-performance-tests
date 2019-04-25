package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jlbojdpwll")
public class JlbojdpwllController {

    private final JlbojdpwllService jlbojdpwllService;

    public JlbojdpwllController(JlbojdpwllService jlbojdpwllService) {
        this.jlbojdpwllService = jlbojdpwllService;
    }

    @Get("/")
    public String index() {
        return jlbojdpwllService.getGreeting();
    }
}
