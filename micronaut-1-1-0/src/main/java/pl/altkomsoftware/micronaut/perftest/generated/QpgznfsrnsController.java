package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qpgznfsrns")
public class QpgznfsrnsController {

    private final QpgznfsrnsService qpgznfsrnsService;

    public QpgznfsrnsController(QpgznfsrnsService qpgznfsrnsService) {
        this.qpgznfsrnsService = qpgznfsrnsService;
    }

    @Get("/")
    public String index() {
        return qpgznfsrnsService.getGreeting();
    }
}
