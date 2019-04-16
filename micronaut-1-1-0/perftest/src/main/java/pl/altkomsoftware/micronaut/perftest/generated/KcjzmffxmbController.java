package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kcjzmffxmb")
public class KcjzmffxmbController {

    private final KcjzmffxmbService kcjzmffxmbService;

    public KcjzmffxmbController(KcjzmffxmbService kcjzmffxmbService) {
        this.kcjzmffxmbService = kcjzmffxmbService;
    }

    @Get("/")
    public String index() {
        return kcjzmffxmbService.getGreeting();
    }
}
