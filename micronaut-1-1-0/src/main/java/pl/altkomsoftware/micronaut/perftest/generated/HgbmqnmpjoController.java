package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hgbmqnmpjo")
public class HgbmqnmpjoController {

    private final HgbmqnmpjoService hgbmqnmpjoService;

    public HgbmqnmpjoController(HgbmqnmpjoService hgbmqnmpjoService) {
        this.hgbmqnmpjoService = hgbmqnmpjoService;
    }

    @Get("/")
    public String index() {
        return hgbmqnmpjoService.getGreeting();
    }
}
