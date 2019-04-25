package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qdrgnduzxm")
public class QdrgnduzxmController {

    private final QdrgnduzxmService qdrgnduzxmService;

    public QdrgnduzxmController(QdrgnduzxmService qdrgnduzxmService) {
        this.qdrgnduzxmService = qdrgnduzxmService;
    }

    @Get("/")
    public String index() {
        return qdrgnduzxmService.getGreeting();
    }
}
