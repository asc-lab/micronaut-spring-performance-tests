package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yhhkeikyyu")
public class YhhkeikyyuController {

    private final YhhkeikyyuService yhhkeikyyuService;

    public YhhkeikyyuController(YhhkeikyyuService yhhkeikyyuService) {
        this.yhhkeikyyuService = yhhkeikyyuService;
    }

    @Get("/")
    public String index() {
        return yhhkeikyyuService.getGreeting();
    }
}
