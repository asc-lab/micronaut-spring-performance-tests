package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vrdnawjbhy")
public class VrdnawjbhyController {

    private final VrdnawjbhyService vrdnawjbhyService;

    public VrdnawjbhyController(VrdnawjbhyService vrdnawjbhyService) {
        this.vrdnawjbhyService = vrdnawjbhyService;
    }

    @Get("/")
    public String index() {
        return vrdnawjbhyService.getGreeting();
    }
}
