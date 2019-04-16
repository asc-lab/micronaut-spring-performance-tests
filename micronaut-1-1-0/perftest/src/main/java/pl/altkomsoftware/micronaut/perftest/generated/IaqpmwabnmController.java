package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iaqpmwabnm")
public class IaqpmwabnmController {

    private final IaqpmwabnmService iaqpmwabnmService;

    public IaqpmwabnmController(IaqpmwabnmService iaqpmwabnmService) {
        this.iaqpmwabnmService = iaqpmwabnmService;
    }

    @Get("/")
    public String index() {
        return iaqpmwabnmService.getGreeting();
    }
}
