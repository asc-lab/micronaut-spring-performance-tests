package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xcawovwvif")
public class XcawovwvifController {

    private final XcawovwvifService xcawovwvifService;

    public XcawovwvifController(XcawovwvifService xcawovwvifService) {
        this.xcawovwvifService = xcawovwvifService;
    }

    @Get("/")
    public String index() {
        return xcawovwvifService.getGreeting();
    }
}
