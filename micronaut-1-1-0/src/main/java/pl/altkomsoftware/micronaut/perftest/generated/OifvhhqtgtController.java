package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oifvhhqtgt")
public class OifvhhqtgtController {

    private final OifvhhqtgtService oifvhhqtgtService;

    public OifvhhqtgtController(OifvhhqtgtService oifvhhqtgtService) {
        this.oifvhhqtgtService = oifvhhqtgtService;
    }

    @Get("/")
    public String index() {
        return oifvhhqtgtService.getGreeting();
    }
}
