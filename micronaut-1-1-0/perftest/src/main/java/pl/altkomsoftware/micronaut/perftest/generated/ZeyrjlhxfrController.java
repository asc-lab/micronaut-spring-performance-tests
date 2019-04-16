package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zeyrjlhxfr")
public class ZeyrjlhxfrController {

    private final ZeyrjlhxfrService zeyrjlhxfrService;

    public ZeyrjlhxfrController(ZeyrjlhxfrService zeyrjlhxfrService) {
        this.zeyrjlhxfrService = zeyrjlhxfrService;
    }

    @Get("/")
    public String index() {
        return zeyrjlhxfrService.getGreeting();
    }
}
