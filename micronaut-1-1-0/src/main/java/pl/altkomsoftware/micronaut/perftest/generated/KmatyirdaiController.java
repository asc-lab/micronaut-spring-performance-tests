package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kmatyirdai")
public class KmatyirdaiController {

    private final KmatyirdaiService kmatyirdaiService;

    public KmatyirdaiController(KmatyirdaiService kmatyirdaiService) {
        this.kmatyirdaiService = kmatyirdaiService;
    }

    @Get("/")
    public String index() {
        return kmatyirdaiService.getGreeting();
    }
}
