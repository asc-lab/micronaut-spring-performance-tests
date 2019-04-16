package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ueunujwcdm")
public class UeunujwcdmController {

    private final UeunujwcdmService ueunujwcdmService;

    public UeunujwcdmController(UeunujwcdmService ueunujwcdmService) {
        this.ueunujwcdmService = ueunujwcdmService;
    }

    @Get("/")
    public String index() {
        return ueunujwcdmService.getGreeting();
    }
}
