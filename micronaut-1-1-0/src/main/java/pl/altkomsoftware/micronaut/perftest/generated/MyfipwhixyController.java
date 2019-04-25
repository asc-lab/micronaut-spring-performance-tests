package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/myfipwhixy")
public class MyfipwhixyController {

    private final MyfipwhixyService myfipwhixyService;

    public MyfipwhixyController(MyfipwhixyService myfipwhixyService) {
        this.myfipwhixyService = myfipwhixyService;
    }

    @Get("/")
    public String index() {
        return myfipwhixyService.getGreeting();
    }
}
