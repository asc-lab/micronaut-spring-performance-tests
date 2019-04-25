package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wmdpqxhioj")
public class WmdpqxhiojController {

    private final WmdpqxhiojService wmdpqxhiojService;

    public WmdpqxhiojController(WmdpqxhiojService wmdpqxhiojService) {
        this.wmdpqxhiojService = wmdpqxhiojService;
    }

    @Get("/")
    public String index() {
        return wmdpqxhiojService.getGreeting();
    }
}
