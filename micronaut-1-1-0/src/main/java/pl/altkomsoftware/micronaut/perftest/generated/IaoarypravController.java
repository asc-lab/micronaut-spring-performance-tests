package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iaoaryprav")
public class IaoarypravController {

    private final IaoarypravService iaoarypravService;

    public IaoarypravController(IaoarypravService iaoarypravService) {
        this.iaoarypravService = iaoarypravService;
    }

    @Get("/")
    public String index() {
        return iaoarypravService.getGreeting();
    }
}
