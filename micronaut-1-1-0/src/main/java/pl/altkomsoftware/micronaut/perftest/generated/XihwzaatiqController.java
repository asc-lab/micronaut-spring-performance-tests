package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xihwzaatiq")
public class XihwzaatiqController {

    private final XihwzaatiqService xihwzaatiqService;

    public XihwzaatiqController(XihwzaatiqService xihwzaatiqService) {
        this.xihwzaatiqService = xihwzaatiqService;
    }

    @Get("/")
    public String index() {
        return xihwzaatiqService.getGreeting();
    }
}
