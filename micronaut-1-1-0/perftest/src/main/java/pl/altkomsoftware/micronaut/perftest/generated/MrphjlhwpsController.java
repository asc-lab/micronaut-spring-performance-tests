package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mrphjlhwps")
public class MrphjlhwpsController {

    private final MrphjlhwpsService mrphjlhwpsService;

    public MrphjlhwpsController(MrphjlhwpsService mrphjlhwpsService) {
        this.mrphjlhwpsService = mrphjlhwpsService;
    }

    @Get("/")
    public String index() {
        return mrphjlhwpsService.getGreeting();
    }
}
