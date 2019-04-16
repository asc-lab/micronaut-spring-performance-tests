package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/prifqyosel")
public class PrifqyoselController {

    private final PrifqyoselService prifqyoselService;

    public PrifqyoselController(PrifqyoselService prifqyoselService) {
        this.prifqyoselService = prifqyoselService;
    }

    @Get("/")
    public String index() {
        return prifqyoselService.getGreeting();
    }
}
