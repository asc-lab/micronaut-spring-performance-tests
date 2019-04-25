package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hsrdjovyun")
public class HsrdjovyunController {

    private final HsrdjovyunService hsrdjovyunService;

    public HsrdjovyunController(HsrdjovyunService hsrdjovyunService) {
        this.hsrdjovyunService = hsrdjovyunService;
    }

    @Get("/")
    public String index() {
        return hsrdjovyunService.getGreeting();
    }
}
