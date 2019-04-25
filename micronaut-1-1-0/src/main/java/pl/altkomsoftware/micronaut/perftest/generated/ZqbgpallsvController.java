package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zqbgpallsv")
public class ZqbgpallsvController {

    private final ZqbgpallsvService zqbgpallsvService;

    public ZqbgpallsvController(ZqbgpallsvService zqbgpallsvService) {
        this.zqbgpallsvService = zqbgpallsvService;
    }

    @Get("/")
    public String index() {
        return zqbgpallsvService.getGreeting();
    }
}
