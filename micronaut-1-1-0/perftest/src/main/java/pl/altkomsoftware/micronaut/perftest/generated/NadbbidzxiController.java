package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nadbbidzxi")
public class NadbbidzxiController {

    private final NadbbidzxiService nadbbidzxiService;

    public NadbbidzxiController(NadbbidzxiService nadbbidzxiService) {
        this.nadbbidzxiService = nadbbidzxiService;
    }

    @Get("/")
    public String index() {
        return nadbbidzxiService.getGreeting();
    }
}
