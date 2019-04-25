package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nmdnbiiwgk")
public class NmdnbiiwgkController {

    private final NmdnbiiwgkService nmdnbiiwgkService;

    public NmdnbiiwgkController(NmdnbiiwgkService nmdnbiiwgkService) {
        this.nmdnbiiwgkService = nmdnbiiwgkService;
    }

    @Get("/")
    public String index() {
        return nmdnbiiwgkService.getGreeting();
    }
}
