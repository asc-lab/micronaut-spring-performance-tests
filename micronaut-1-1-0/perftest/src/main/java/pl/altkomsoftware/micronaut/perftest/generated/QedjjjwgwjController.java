package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qedjjjwgwj")
public class QedjjjwgwjController {

    private final QedjjjwgwjService qedjjjwgwjService;

    public QedjjjwgwjController(QedjjjwgwjService qedjjjwgwjService) {
        this.qedjjjwgwjService = qedjjjwgwjService;
    }

    @Get("/")
    public String index() {
        return qedjjjwgwjService.getGreeting();
    }
}
