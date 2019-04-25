package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/aydfjzrpfm")
public class AydfjzrpfmController {

    private final AydfjzrpfmService aydfjzrpfmService;

    public AydfjzrpfmController(AydfjzrpfmService aydfjzrpfmService) {
        this.aydfjzrpfmService = aydfjzrpfmService;
    }

    @Get("/")
    public String index() {
        return aydfjzrpfmService.getGreeting();
    }
}
