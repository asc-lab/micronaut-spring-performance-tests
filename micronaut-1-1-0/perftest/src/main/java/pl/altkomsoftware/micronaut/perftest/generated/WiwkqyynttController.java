package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wiwkqyyntt")
public class WiwkqyynttController {

    private final WiwkqyynttService wiwkqyynttService;

    public WiwkqyynttController(WiwkqyynttService wiwkqyynttService) {
        this.wiwkqyynttService = wiwkqyynttService;
    }

    @Get("/")
    public String index() {
        return wiwkqyynttService.getGreeting();
    }
}
