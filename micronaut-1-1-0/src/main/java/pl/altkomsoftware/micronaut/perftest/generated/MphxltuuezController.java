package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mphxltuuez")
public class MphxltuuezController {

    private final MphxltuuezService mphxltuuezService;

    public MphxltuuezController(MphxltuuezService mphxltuuezService) {
        this.mphxltuuezService = mphxltuuezService;
    }

    @Get("/")
    public String index() {
        return mphxltuuezService.getGreeting();
    }
}
