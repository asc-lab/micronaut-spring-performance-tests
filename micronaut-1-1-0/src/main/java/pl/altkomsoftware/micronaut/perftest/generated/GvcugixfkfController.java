package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gvcugixfkf")
public class GvcugixfkfController {

    private final GvcugixfkfService gvcugixfkfService;

    public GvcugixfkfController(GvcugixfkfService gvcugixfkfService) {
        this.gvcugixfkfService = gvcugixfkfService;
    }

    @Get("/")
    public String index() {
        return gvcugixfkfService.getGreeting();
    }
}
