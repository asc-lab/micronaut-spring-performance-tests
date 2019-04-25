package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qaxmmrdegu")
public class QaxmmrdeguController {

    private final QaxmmrdeguService qaxmmrdeguService;

    public QaxmmrdeguController(QaxmmrdeguService qaxmmrdeguService) {
        this.qaxmmrdeguService = qaxmmrdeguService;
    }

    @Get("/")
    public String index() {
        return qaxmmrdeguService.getGreeting();
    }
}
