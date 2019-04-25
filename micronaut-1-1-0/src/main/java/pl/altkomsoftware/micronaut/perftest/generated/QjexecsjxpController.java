package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qjexecsjxp")
public class QjexecsjxpController {

    private final QjexecsjxpService qjexecsjxpService;

    public QjexecsjxpController(QjexecsjxpService qjexecsjxpService) {
        this.qjexecsjxpService = qjexecsjxpService;
    }

    @Get("/")
    public String index() {
        return qjexecsjxpService.getGreeting();
    }
}
