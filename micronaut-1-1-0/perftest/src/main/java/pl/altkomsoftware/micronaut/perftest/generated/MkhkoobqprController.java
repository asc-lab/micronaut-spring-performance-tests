package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mkhkoobqpr")
public class MkhkoobqprController {

    private final MkhkoobqprService mkhkoobqprService;

    public MkhkoobqprController(MkhkoobqprService mkhkoobqprService) {
        this.mkhkoobqprService = mkhkoobqprService;
    }

    @Get("/")
    public String index() {
        return mkhkoobqprService.getGreeting();
    }
}
