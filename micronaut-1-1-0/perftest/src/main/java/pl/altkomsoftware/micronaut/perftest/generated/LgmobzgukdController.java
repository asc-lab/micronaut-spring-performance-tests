package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lgmobzgukd")
public class LgmobzgukdController {

    private final LgmobzgukdService lgmobzgukdService;

    public LgmobzgukdController(LgmobzgukdService lgmobzgukdService) {
        this.lgmobzgukdService = lgmobzgukdService;
    }

    @Get("/")
    public String index() {
        return lgmobzgukdService.getGreeting();
    }
}
