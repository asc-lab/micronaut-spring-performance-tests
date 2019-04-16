package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/svpsdusqcx")
public class SvpsdusqcxController {

    private final SvpsdusqcxService svpsdusqcxService;

    public SvpsdusqcxController(SvpsdusqcxService svpsdusqcxService) {
        this.svpsdusqcxService = svpsdusqcxService;
    }

    @Get("/")
    public String index() {
        return svpsdusqcxService.getGreeting();
    }
}
