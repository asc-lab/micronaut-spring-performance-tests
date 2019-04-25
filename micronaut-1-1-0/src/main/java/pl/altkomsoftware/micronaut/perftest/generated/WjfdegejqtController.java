package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wjfdegejqt")
public class WjfdegejqtController {

    private final WjfdegejqtService wjfdegejqtService;

    public WjfdegejqtController(WjfdegejqtService wjfdegejqtService) {
        this.wjfdegejqtService = wjfdegejqtService;
    }

    @Get("/")
    public String index() {
        return wjfdegejqtService.getGreeting();
    }
}
