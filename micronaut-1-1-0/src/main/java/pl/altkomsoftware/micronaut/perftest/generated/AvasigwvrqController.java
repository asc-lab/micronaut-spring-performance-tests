package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/avasigwvrq")
public class AvasigwvrqController {

    private final AvasigwvrqService avasigwvrqService;

    public AvasigwvrqController(AvasigwvrqService avasigwvrqService) {
        this.avasigwvrqService = avasigwvrqService;
    }

    @Get("/")
    public String index() {
        return avasigwvrqService.getGreeting();
    }
}
