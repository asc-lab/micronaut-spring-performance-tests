package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jvxruxaopx")
public class JvxruxaopxController {

    private final JvxruxaopxService jvxruxaopxService;

    public JvxruxaopxController(JvxruxaopxService jvxruxaopxService) {
        this.jvxruxaopxService = jvxruxaopxService;
    }

    @Get("/")
    public String index() {
        return jvxruxaopxService.getGreeting();
    }
}
