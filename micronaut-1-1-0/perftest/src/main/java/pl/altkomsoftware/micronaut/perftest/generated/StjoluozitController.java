package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/stjoluozit")
public class StjoluozitController {

    private final StjoluozitService stjoluozitService;

    public StjoluozitController(StjoluozitService stjoluozitService) {
        this.stjoluozitService = stjoluozitService;
    }

    @Get("/")
    public String index() {
        return stjoluozitService.getGreeting();
    }
}
