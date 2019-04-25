package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/okhhsfgksp")
public class OkhhsfgkspController {

    private final OkhhsfgkspService okhhsfgkspService;

    public OkhhsfgkspController(OkhhsfgkspService okhhsfgkspService) {
        this.okhhsfgkspService = okhhsfgkspService;
    }

    @Get("/")
    public String index() {
        return okhhsfgkspService.getGreeting();
    }
}
