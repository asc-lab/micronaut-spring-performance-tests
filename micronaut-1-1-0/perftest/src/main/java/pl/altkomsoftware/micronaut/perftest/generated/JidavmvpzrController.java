package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jidavmvpzr")
public class JidavmvpzrController {

    private final JidavmvpzrService jidavmvpzrService;

    public JidavmvpzrController(JidavmvpzrService jidavmvpzrService) {
        this.jidavmvpzrService = jidavmvpzrService;
    }

    @Get("/")
    public String index() {
        return jidavmvpzrService.getGreeting();
    }
}
