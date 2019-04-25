package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cwqsyyjiqr")
public class CwqsyyjiqrController {

    private final CwqsyyjiqrService cwqsyyjiqrService;

    public CwqsyyjiqrController(CwqsyyjiqrService cwqsyyjiqrService) {
        this.cwqsyyjiqrService = cwqsyyjiqrService;
    }

    @Get("/")
    public String index() {
        return cwqsyyjiqrService.getGreeting();
    }
}
