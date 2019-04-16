package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jcufhkleij")
public class JcufhkleijController {

    private final JcufhkleijService jcufhkleijService;

    public JcufhkleijController(JcufhkleijService jcufhkleijService) {
        this.jcufhkleijService = jcufhkleijService;
    }

    @Get("/")
    public String index() {
        return jcufhkleijService.getGreeting();
    }
}
