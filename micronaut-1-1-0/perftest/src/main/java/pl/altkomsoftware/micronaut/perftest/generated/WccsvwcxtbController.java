package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wccsvwcxtb")
public class WccsvwcxtbController {

    private final WccsvwcxtbService wccsvwcxtbService;

    public WccsvwcxtbController(WccsvwcxtbService wccsvwcxtbService) {
        this.wccsvwcxtbService = wccsvwcxtbService;
    }

    @Get("/")
    public String index() {
        return wccsvwcxtbService.getGreeting();
    }
}
