package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dbsfepuybs")
public class DbsfepuybsController {

    private final DbsfepuybsService dbsfepuybsService;

    public DbsfepuybsController(DbsfepuybsService dbsfepuybsService) {
        this.dbsfepuybsService = dbsfepuybsService;
    }

    @Get("/")
    public String index() {
        return dbsfepuybsService.getGreeting();
    }
}
