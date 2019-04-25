package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rislunuxui")
public class RislunuxuiController {

    private final RislunuxuiService rislunuxuiService;

    public RislunuxuiController(RislunuxuiService rislunuxuiService) {
        this.rislunuxuiService = rislunuxuiService;
    }

    @Get("/")
    public String index() {
        return rislunuxuiService.getGreeting();
    }
}
