package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wxomowkjbw")
public class WxomowkjbwController {

    private final WxomowkjbwService wxomowkjbwService;

    public WxomowkjbwController(WxomowkjbwService wxomowkjbwService) {
        this.wxomowkjbwService = wxomowkjbwService;
    }

    @Get("/")
    public String index() {
        return wxomowkjbwService.getGreeting();
    }
}
