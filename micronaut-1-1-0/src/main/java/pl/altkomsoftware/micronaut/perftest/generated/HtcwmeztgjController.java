package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/htcwmeztgj")
public class HtcwmeztgjController {

    private final HtcwmeztgjService htcwmeztgjService;

    public HtcwmeztgjController(HtcwmeztgjService htcwmeztgjService) {
        this.htcwmeztgjService = htcwmeztgjService;
    }

    @Get("/")
    public String index() {
        return htcwmeztgjService.getGreeting();
    }
}
