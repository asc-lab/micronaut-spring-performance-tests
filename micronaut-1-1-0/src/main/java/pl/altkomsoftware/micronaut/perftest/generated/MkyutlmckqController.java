package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mkyutlmckq")
public class MkyutlmckqController {

    private final MkyutlmckqService mkyutlmckqService;

    public MkyutlmckqController(MkyutlmckqService mkyutlmckqService) {
        this.mkyutlmckqService = mkyutlmckqService;
    }

    @Get("/")
    public String index() {
        return mkyutlmckqService.getGreeting();
    }
}
