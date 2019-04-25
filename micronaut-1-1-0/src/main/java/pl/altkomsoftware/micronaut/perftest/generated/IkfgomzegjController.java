package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ikfgomzegj")
public class IkfgomzegjController {

    private final IkfgomzegjService ikfgomzegjService;

    public IkfgomzegjController(IkfgomzegjService ikfgomzegjService) {
        this.ikfgomzegjService = ikfgomzegjService;
    }

    @Get("/")
    public String index() {
        return ikfgomzegjService.getGreeting();
    }
}
