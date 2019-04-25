package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ycvuonztvk")
public class YcvuonztvkController {

    private final YcvuonztvkService ycvuonztvkService;

    public YcvuonztvkController(YcvuonztvkService ycvuonztvkService) {
        this.ycvuonztvkService = ycvuonztvkService;
    }

    @Get("/")
    public String index() {
        return ycvuonztvkService.getGreeting();
    }
}
