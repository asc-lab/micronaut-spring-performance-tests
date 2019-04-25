package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xiirzmjajs")
public class XiirzmjajsController {

    private final XiirzmjajsService xiirzmjajsService;

    public XiirzmjajsController(XiirzmjajsService xiirzmjajsService) {
        this.xiirzmjajsService = xiirzmjajsService;
    }

    @Get("/")
    public String index() {
        return xiirzmjajsService.getGreeting();
    }
}
