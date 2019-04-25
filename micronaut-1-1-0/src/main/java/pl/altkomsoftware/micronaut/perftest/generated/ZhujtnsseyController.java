package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zhujtnssey")
public class ZhujtnsseyController {

    private final ZhujtnsseyService zhujtnsseyService;

    public ZhujtnsseyController(ZhujtnsseyService zhujtnsseyService) {
        this.zhujtnsseyService = zhujtnsseyService;
    }

    @Get("/")
    public String index() {
        return zhujtnsseyService.getGreeting();
    }
}
