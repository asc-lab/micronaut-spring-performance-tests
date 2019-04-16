package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iyhjptiojm")
public class IyhjptiojmController {

    private final IyhjptiojmService iyhjptiojmService;

    public IyhjptiojmController(IyhjptiojmService iyhjptiojmService) {
        this.iyhjptiojmService = iyhjptiojmService;
    }

    @Get("/")
    public String index() {
        return iyhjptiojmService.getGreeting();
    }
}
