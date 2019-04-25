package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nixvorhttk")
public class NixvorhttkController {

    private final NixvorhttkService nixvorhttkService;

    public NixvorhttkController(NixvorhttkService nixvorhttkService) {
        this.nixvorhttkService = nixvorhttkService;
    }

    @Get("/")
    public String index() {
        return nixvorhttkService.getGreeting();
    }
}
