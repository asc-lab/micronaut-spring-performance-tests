package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zlpgzownii")
public class ZlpgzowniiController {

    private final ZlpgzowniiService zlpgzowniiService;

    public ZlpgzowniiController(ZlpgzowniiService zlpgzowniiService) {
        this.zlpgzowniiService = zlpgzowniiService;
    }

    @Get("/")
    public String index() {
        return zlpgzowniiService.getGreeting();
    }
}
