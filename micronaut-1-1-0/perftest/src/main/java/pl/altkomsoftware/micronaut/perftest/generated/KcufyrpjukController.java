package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kcufyrpjuk")
public class KcufyrpjukController {

    private final KcufyrpjukService kcufyrpjukService;

    public KcufyrpjukController(KcufyrpjukService kcufyrpjukService) {
        this.kcufyrpjukService = kcufyrpjukService;
    }

    @Get("/")
    public String index() {
        return kcufyrpjukService.getGreeting();
    }
}
