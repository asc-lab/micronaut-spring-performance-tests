package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xvlwsezknp")
public class XvlwsezknpController {

    private final XvlwsezknpService xvlwsezknpService;

    public XvlwsezknpController(XvlwsezknpService xvlwsezknpService) {
        this.xvlwsezknpService = xvlwsezknpService;
    }

    @Get("/")
    public String index() {
        return xvlwsezknpService.getGreeting();
    }
}
