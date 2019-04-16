package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qquggrqtpi")
public class QquggrqtpiController {

    private final QquggrqtpiService qquggrqtpiService;

    public QquggrqtpiController(QquggrqtpiService qquggrqtpiService) {
        this.qquggrqtpiService = qquggrqtpiService;
    }

    @Get("/")
    public String index() {
        return qquggrqtpiService.getGreeting();
    }
}
