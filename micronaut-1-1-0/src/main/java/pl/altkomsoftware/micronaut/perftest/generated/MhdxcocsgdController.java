package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mhdxcocsgd")
public class MhdxcocsgdController {

    private final MhdxcocsgdService mhdxcocsgdService;

    public MhdxcocsgdController(MhdxcocsgdService mhdxcocsgdService) {
        this.mhdxcocsgdService = mhdxcocsgdService;
    }

    @Get("/")
    public String index() {
        return mhdxcocsgdService.getGreeting();
    }
}
