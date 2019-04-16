package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xskgoyebik")
public class XskgoyebikController {

    private final XskgoyebikService xskgoyebikService;

    public XskgoyebikController(XskgoyebikService xskgoyebikService) {
        this.xskgoyebikService = xskgoyebikService;
    }

    @Get("/")
    public String index() {
        return xskgoyebikService.getGreeting();
    }
}
