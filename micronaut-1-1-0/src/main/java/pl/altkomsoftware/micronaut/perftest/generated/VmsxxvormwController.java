package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vmsxxvormw")
public class VmsxxvormwController {

    private final VmsxxvormwService vmsxxvormwService;

    public VmsxxvormwController(VmsxxvormwService vmsxxvormwService) {
        this.vmsxxvormwService = vmsxxvormwService;
    }

    @Get("/")
    public String index() {
        return vmsxxvormwService.getGreeting();
    }
}
