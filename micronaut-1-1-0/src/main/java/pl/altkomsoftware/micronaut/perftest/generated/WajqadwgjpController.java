package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wajqadwgjp")
public class WajqadwgjpController {

    private final WajqadwgjpService wajqadwgjpService;

    public WajqadwgjpController(WajqadwgjpService wajqadwgjpService) {
        this.wajqadwgjpService = wajqadwgjpService;
    }

    @Get("/")
    public String index() {
        return wajqadwgjpService.getGreeting();
    }
}
