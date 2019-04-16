package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qgivftlbrp")
public class QgivftlbrpController {

    private final QgivftlbrpService qgivftlbrpService;

    public QgivftlbrpController(QgivftlbrpService qgivftlbrpService) {
        this.qgivftlbrpService = qgivftlbrpService;
    }

    @Get("/")
    public String index() {
        return qgivftlbrpService.getGreeting();
    }
}
