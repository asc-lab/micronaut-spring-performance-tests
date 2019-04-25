package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/llhwnxvilf")
public class LlhwnxvilfController {

    private final LlhwnxvilfService llhwnxvilfService;

    public LlhwnxvilfController(LlhwnxvilfService llhwnxvilfService) {
        this.llhwnxvilfService = llhwnxvilfService;
    }

    @Get("/")
    public String index() {
        return llhwnxvilfService.getGreeting();
    }
}
