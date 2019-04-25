package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xsculmcayn")
public class XsculmcaynController {

    private final XsculmcaynService xsculmcaynService;

    public XsculmcaynController(XsculmcaynService xsculmcaynService) {
        this.xsculmcaynService = xsculmcaynService;
    }

    @Get("/")
    public String index() {
        return xsculmcaynService.getGreeting();
    }
}
