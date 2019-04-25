package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dnriavrmtm")
public class DnriavrmtmController {

    private final DnriavrmtmService dnriavrmtmService;

    public DnriavrmtmController(DnriavrmtmService dnriavrmtmService) {
        this.dnriavrmtmService = dnriavrmtmService;
    }

    @Get("/")
    public String index() {
        return dnriavrmtmService.getGreeting();
    }
}
