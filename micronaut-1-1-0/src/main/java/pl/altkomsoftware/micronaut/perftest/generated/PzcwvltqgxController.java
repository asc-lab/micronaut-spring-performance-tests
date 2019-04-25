package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pzcwvltqgx")
public class PzcwvltqgxController {

    private final PzcwvltqgxService pzcwvltqgxService;

    public PzcwvltqgxController(PzcwvltqgxService pzcwvltqgxService) {
        this.pzcwvltqgxService = pzcwvltqgxService;
    }

    @Get("/")
    public String index() {
        return pzcwvltqgxService.getGreeting();
    }
}
