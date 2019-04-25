package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kvhkbaoyak")
public class KvhkbaoyakController {

    private final KvhkbaoyakService kvhkbaoyakService;

    public KvhkbaoyakController(KvhkbaoyakService kvhkbaoyakService) {
        this.kvhkbaoyakService = kvhkbaoyakService;
    }

    @Get("/")
    public String index() {
        return kvhkbaoyakService.getGreeting();
    }
}
