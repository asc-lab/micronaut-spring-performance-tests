package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zkquvyrdbu")
public class ZkquvyrdbuController {

    private final ZkquvyrdbuService zkquvyrdbuService;

    public ZkquvyrdbuController(ZkquvyrdbuService zkquvyrdbuService) {
        this.zkquvyrdbuService = zkquvyrdbuService;
    }

    @Get("/")
    public String index() {
        return zkquvyrdbuService.getGreeting();
    }
}
