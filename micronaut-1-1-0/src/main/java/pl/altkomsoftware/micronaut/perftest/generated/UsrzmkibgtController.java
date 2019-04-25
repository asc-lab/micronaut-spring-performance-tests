package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/usrzmkibgt")
public class UsrzmkibgtController {

    private final UsrzmkibgtService usrzmkibgtService;

    public UsrzmkibgtController(UsrzmkibgtService usrzmkibgtService) {
        this.usrzmkibgtService = usrzmkibgtService;
    }

    @Get("/")
    public String index() {
        return usrzmkibgtService.getGreeting();
    }
}
