package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vfslaqzote")
public class VfslaqzoteController {

    private final VfslaqzoteService vfslaqzoteService;

    public VfslaqzoteController(VfslaqzoteService vfslaqzoteService) {
        this.vfslaqzoteService = vfslaqzoteService;
    }

    @Get("/")
    public String index() {
        return vfslaqzoteService.getGreeting();
    }
}
