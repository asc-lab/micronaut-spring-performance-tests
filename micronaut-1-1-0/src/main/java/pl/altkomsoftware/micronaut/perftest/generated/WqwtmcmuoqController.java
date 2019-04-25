package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wqwtmcmuoq")
public class WqwtmcmuoqController {

    private final WqwtmcmuoqService wqwtmcmuoqService;

    public WqwtmcmuoqController(WqwtmcmuoqService wqwtmcmuoqService) {
        this.wqwtmcmuoqService = wqwtmcmuoqService;
    }

    @Get("/")
    public String index() {
        return wqwtmcmuoqService.getGreeting();
    }
}
