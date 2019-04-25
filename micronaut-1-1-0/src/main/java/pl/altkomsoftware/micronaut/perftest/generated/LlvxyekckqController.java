package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/llvxyekckq")
public class LlvxyekckqController {

    private final LlvxyekckqService llvxyekckqService;

    public LlvxyekckqController(LlvxyekckqService llvxyekckqService) {
        this.llvxyekckqService = llvxyekckqService;
    }

    @Get("/")
    public String index() {
        return llvxyekckqService.getGreeting();
    }
}
