package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mflathkdtw")
public class MflathkdtwController {

    private final MflathkdtwService mflathkdtwService;

    public MflathkdtwController(MflathkdtwService mflathkdtwService) {
        this.mflathkdtwService = mflathkdtwService;
    }

    @Get("/")
    public String index() {
        return mflathkdtwService.getGreeting();
    }
}
