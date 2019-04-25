package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/madvbyyimi")
public class MadvbyyimiController {

    private final MadvbyyimiService madvbyyimiService;

    public MadvbyyimiController(MadvbyyimiService madvbyyimiService) {
        this.madvbyyimiService = madvbyyimiService;
    }

    @Get("/")
    public String index() {
        return madvbyyimiService.getGreeting();
    }
}
