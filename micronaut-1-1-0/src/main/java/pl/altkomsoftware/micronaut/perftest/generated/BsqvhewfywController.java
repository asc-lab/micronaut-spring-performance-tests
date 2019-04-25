package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bsqvhewfyw")
public class BsqvhewfywController {

    private final BsqvhewfywService bsqvhewfywService;

    public BsqvhewfywController(BsqvhewfywService bsqvhewfywService) {
        this.bsqvhewfywService = bsqvhewfywService;
    }

    @Get("/")
    public String index() {
        return bsqvhewfywService.getGreeting();
    }
}
