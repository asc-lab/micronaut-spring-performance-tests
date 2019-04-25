package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xnmnwibfbn")
public class XnmnwibfbnController {

    private final XnmnwibfbnService xnmnwibfbnService;

    public XnmnwibfbnController(XnmnwibfbnService xnmnwibfbnService) {
        this.xnmnwibfbnService = xnmnwibfbnService;
    }

    @Get("/")
    public String index() {
        return xnmnwibfbnService.getGreeting();
    }
}
