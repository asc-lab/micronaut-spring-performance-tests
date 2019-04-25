package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ilnnieearv")
public class IlnnieearvController {

    private final IlnnieearvService ilnnieearvService;

    public IlnnieearvController(IlnnieearvService ilnnieearvService) {
        this.ilnnieearvService = ilnnieearvService;
    }

    @Get("/")
    public String index() {
        return ilnnieearvService.getGreeting();
    }
}
