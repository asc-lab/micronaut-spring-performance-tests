package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hybtmvzstm")
public class HybtmvzstmController {

    private final HybtmvzstmService hybtmvzstmService;

    public HybtmvzstmController(HybtmvzstmService hybtmvzstmService) {
        this.hybtmvzstmService = hybtmvzstmService;
    }

    @Get("/")
    public String index() {
        return hybtmvzstmService.getGreeting();
    }
}
