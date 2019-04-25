package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jjmlyoqnby")
public class JjmlyoqnbyController {

    private final JjmlyoqnbyService jjmlyoqnbyService;

    public JjmlyoqnbyController(JjmlyoqnbyService jjmlyoqnbyService) {
        this.jjmlyoqnbyService = jjmlyoqnbyService;
    }

    @Get("/")
    public String index() {
        return jjmlyoqnbyService.getGreeting();
    }
}
