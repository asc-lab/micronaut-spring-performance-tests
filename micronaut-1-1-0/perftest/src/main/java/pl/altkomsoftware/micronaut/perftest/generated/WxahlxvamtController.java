package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wxahlxvamt")
public class WxahlxvamtController {

    private final WxahlxvamtService wxahlxvamtService;

    public WxahlxvamtController(WxahlxvamtService wxahlxvamtService) {
        this.wxahlxvamtService = wxahlxvamtService;
    }

    @Get("/")
    public String index() {
        return wxahlxvamtService.getGreeting();
    }
}
