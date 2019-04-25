package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qigmhfwtqm")
public class QigmhfwtqmController {

    private final QigmhfwtqmService qigmhfwtqmService;

    public QigmhfwtqmController(QigmhfwtqmService qigmhfwtqmService) {
        this.qigmhfwtqmService = qigmhfwtqmService;
    }

    @Get("/")
    public String index() {
        return qigmhfwtqmService.getGreeting();
    }
}
