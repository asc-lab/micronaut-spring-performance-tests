package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gqcotsdfhm")
public class GqcotsdfhmController {

    private final GqcotsdfhmService gqcotsdfhmService;

    public GqcotsdfhmController(GqcotsdfhmService gqcotsdfhmService) {
        this.gqcotsdfhmService = gqcotsdfhmService;
    }

    @Get("/")
    public String index() {
        return gqcotsdfhmService.getGreeting();
    }
}
