package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yevjtszzxf")
public class YevjtszzxfController {

    private final YevjtszzxfService yevjtszzxfService;

    public YevjtszzxfController(YevjtszzxfService yevjtszzxfService) {
        this.yevjtszzxfService = yevjtszzxfService;
    }

    @Get("/")
    public String index() {
        return yevjtszzxfService.getGreeting();
    }
}
