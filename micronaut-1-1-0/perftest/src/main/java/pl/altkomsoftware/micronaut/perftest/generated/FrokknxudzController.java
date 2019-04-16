package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/frokknxudz")
public class FrokknxudzController {

    private final FrokknxudzService frokknxudzService;

    public FrokknxudzController(FrokknxudzService frokknxudzService) {
        this.frokknxudzService = frokknxudzService;
    }

    @Get("/")
    public String index() {
        return frokknxudzService.getGreeting();
    }
}
