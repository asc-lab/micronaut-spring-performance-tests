package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mcdflgelcv")
public class McdflgelcvController {

    private final McdflgelcvService mcdflgelcvService;

    public McdflgelcvController(McdflgelcvService mcdflgelcvService) {
        this.mcdflgelcvService = mcdflgelcvService;
    }

    @Get("/")
    public String index() {
        return mcdflgelcvService.getGreeting();
    }
}
