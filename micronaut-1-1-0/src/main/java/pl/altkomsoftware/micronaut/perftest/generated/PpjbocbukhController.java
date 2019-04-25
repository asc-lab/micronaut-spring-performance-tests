package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ppjbocbukh")
public class PpjbocbukhController {

    private final PpjbocbukhService ppjbocbukhService;

    public PpjbocbukhController(PpjbocbukhService ppjbocbukhService) {
        this.ppjbocbukhService = ppjbocbukhService;
    }

    @Get("/")
    public String index() {
        return ppjbocbukhService.getGreeting();
    }
}
