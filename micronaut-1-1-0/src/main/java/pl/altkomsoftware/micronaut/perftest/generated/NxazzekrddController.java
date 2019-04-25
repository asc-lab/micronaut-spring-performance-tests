package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nxazzekrdd")
public class NxazzekrddController {

    private final NxazzekrddService nxazzekrddService;

    public NxazzekrddController(NxazzekrddService nxazzekrddService) {
        this.nxazzekrddService = nxazzekrddService;
    }

    @Get("/")
    public String index() {
        return nxazzekrddService.getGreeting();
    }
}
