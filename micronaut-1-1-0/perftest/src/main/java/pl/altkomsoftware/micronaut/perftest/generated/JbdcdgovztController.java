package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jbdcdgovzt")
public class JbdcdgovztController {

    private final JbdcdgovztService jbdcdgovztService;

    public JbdcdgovztController(JbdcdgovztService jbdcdgovztService) {
        this.jbdcdgovztService = jbdcdgovztService;
    }

    @Get("/")
    public String index() {
        return jbdcdgovztService.getGreeting();
    }
}
