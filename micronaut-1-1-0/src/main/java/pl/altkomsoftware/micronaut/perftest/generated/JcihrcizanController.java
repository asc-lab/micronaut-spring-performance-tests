package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jcihrcizan")
public class JcihrcizanController {

    private final JcihrcizanService jcihrcizanService;

    public JcihrcizanController(JcihrcizanService jcihrcizanService) {
        this.jcihrcizanService = jcihrcizanService;
    }

    @Get("/")
    public String index() {
        return jcihrcizanService.getGreeting();
    }
}
