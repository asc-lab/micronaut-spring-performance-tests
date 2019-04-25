package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mbcqxsbtzg")
public class MbcqxsbtzgController {

    private final MbcqxsbtzgService mbcqxsbtzgService;

    public MbcqxsbtzgController(MbcqxsbtzgService mbcqxsbtzgService) {
        this.mbcqxsbtzgService = mbcqxsbtzgService;
    }

    @Get("/")
    public String index() {
        return mbcqxsbtzgService.getGreeting();
    }
}
