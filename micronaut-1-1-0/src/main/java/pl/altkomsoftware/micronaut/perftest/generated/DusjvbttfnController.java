package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dusjvbttfn")
public class DusjvbttfnController {

    private final DusjvbttfnService dusjvbttfnService;

    public DusjvbttfnController(DusjvbttfnService dusjvbttfnService) {
        this.dusjvbttfnService = dusjvbttfnService;
    }

    @Get("/")
    public String index() {
        return dusjvbttfnService.getGreeting();
    }
}
