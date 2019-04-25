package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mamgqdfozr")
public class MamgqdfozrController {

    private final MamgqdfozrService mamgqdfozrService;

    public MamgqdfozrController(MamgqdfozrService mamgqdfozrService) {
        this.mamgqdfozrService = mamgqdfozrService;
    }

    @Get("/")
    public String index() {
        return mamgqdfozrService.getGreeting();
    }
}
