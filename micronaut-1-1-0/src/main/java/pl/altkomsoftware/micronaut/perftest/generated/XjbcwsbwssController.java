package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xjbcwsbwss")
public class XjbcwsbwssController {

    private final XjbcwsbwssService xjbcwsbwssService;

    public XjbcwsbwssController(XjbcwsbwssService xjbcwsbwssService) {
        this.xjbcwsbwssService = xjbcwsbwssService;
    }

    @Get("/")
    public String index() {
        return xjbcwsbwssService.getGreeting();
    }
}
