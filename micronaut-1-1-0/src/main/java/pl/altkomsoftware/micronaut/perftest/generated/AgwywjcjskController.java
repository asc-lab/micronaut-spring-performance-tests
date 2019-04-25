package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/agwywjcjsk")
public class AgwywjcjskController {

    private final AgwywjcjskService agwywjcjskService;

    public AgwywjcjskController(AgwywjcjskService agwywjcjskService) {
        this.agwywjcjskService = agwywjcjskService;
    }

    @Get("/")
    public String index() {
        return agwywjcjskService.getGreeting();
    }
}
