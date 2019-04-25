package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ntrkkzafrt")
public class NtrkkzafrtController {

    private final NtrkkzafrtService ntrkkzafrtService;

    public NtrkkzafrtController(NtrkkzafrtService ntrkkzafrtService) {
        this.ntrkkzafrtService = ntrkkzafrtService;
    }

    @Get("/")
    public String index() {
        return ntrkkzafrtService.getGreeting();
    }
}
