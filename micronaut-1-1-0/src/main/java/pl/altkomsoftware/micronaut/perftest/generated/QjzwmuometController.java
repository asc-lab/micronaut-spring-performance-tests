package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qjzwmuomet")
public class QjzwmuometController {

    private final QjzwmuometService qjzwmuometService;

    public QjzwmuometController(QjzwmuometService qjzwmuometService) {
        this.qjzwmuometService = qjzwmuometService;
    }

    @Get("/")
    public String index() {
        return qjzwmuometService.getGreeting();
    }
}
