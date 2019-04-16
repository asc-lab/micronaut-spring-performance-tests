package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zlzjfbosxi")
public class ZlzjfbosxiController {

    private final ZlzjfbosxiService zlzjfbosxiService;

    public ZlzjfbosxiController(ZlzjfbosxiService zlzjfbosxiService) {
        this.zlzjfbosxiService = zlzjfbosxiService;
    }

    @Get("/")
    public String index() {
        return zlzjfbosxiService.getGreeting();
    }
}
