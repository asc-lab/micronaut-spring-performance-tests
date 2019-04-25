package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ziohzdvgzh")
public class ZiohzdvgzhController {

    private final ZiohzdvgzhService ziohzdvgzhService;

    public ZiohzdvgzhController(ZiohzdvgzhService ziohzdvgzhService) {
        this.ziohzdvgzhService = ziohzdvgzhService;
    }

    @Get("/")
    public String index() {
        return ziohzdvgzhService.getGreeting();
    }
}
