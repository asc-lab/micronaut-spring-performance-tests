package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nkeivgntxm")
public class NkeivgntxmController {

    private final NkeivgntxmService nkeivgntxmService;

    public NkeivgntxmController(NkeivgntxmService nkeivgntxmService) {
        this.nkeivgntxmService = nkeivgntxmService;
    }

    @Get("/")
    public String index() {
        return nkeivgntxmService.getGreeting();
    }
}
