package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qjrhdmthak")
public class QjrhdmthakController {

    private final QjrhdmthakService qjrhdmthakService;

    public QjrhdmthakController(QjrhdmthakService qjrhdmthakService) {
        this.qjrhdmthakService = qjrhdmthakService;
    }

    @Get("/")
    public String index() {
        return qjrhdmthakService.getGreeting();
    }
}
