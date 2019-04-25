package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yrzawnemya")
public class YrzawnemyaController {

    private final YrzawnemyaService yrzawnemyaService;

    public YrzawnemyaController(YrzawnemyaService yrzawnemyaService) {
        this.yrzawnemyaService = yrzawnemyaService;
    }

    @Get("/")
    public String index() {
        return yrzawnemyaService.getGreeting();
    }
}
