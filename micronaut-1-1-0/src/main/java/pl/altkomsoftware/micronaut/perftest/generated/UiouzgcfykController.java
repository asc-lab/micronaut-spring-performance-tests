package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uiouzgcfyk")
public class UiouzgcfykController {

    private final UiouzgcfykService uiouzgcfykService;

    public UiouzgcfykController(UiouzgcfykService uiouzgcfykService) {
        this.uiouzgcfykService = uiouzgcfykService;
    }

    @Get("/")
    public String index() {
        return uiouzgcfykService.getGreeting();
    }
}
