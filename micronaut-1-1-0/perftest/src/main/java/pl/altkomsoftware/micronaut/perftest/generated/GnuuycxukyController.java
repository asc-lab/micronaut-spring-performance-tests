package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gnuuycxuky")
public class GnuuycxukyController {

    private final GnuuycxukyService gnuuycxukyService;

    public GnuuycxukyController(GnuuycxukyService gnuuycxukyService) {
        this.gnuuycxukyService = gnuuycxukyService;
    }

    @Get("/")
    public String index() {
        return gnuuycxukyService.getGreeting();
    }
}
