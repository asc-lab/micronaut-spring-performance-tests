package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mmlancxjtc")
public class MmlancxjtcController {

    private final MmlancxjtcService mmlancxjtcService;

    public MmlancxjtcController(MmlancxjtcService mmlancxjtcService) {
        this.mmlancxjtcService = mmlancxjtcService;
    }

    @Get("/")
    public String index() {
        return mmlancxjtcService.getGreeting();
    }
}
