package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bjwrpuslef")
public class BjwrpuslefController {

    private final BjwrpuslefService bjwrpuslefService;

    public BjwrpuslefController(BjwrpuslefService bjwrpuslefService) {
        this.bjwrpuslefService = bjwrpuslefService;
    }

    @Get("/")
    public String index() {
        return bjwrpuslefService.getGreeting();
    }
}
