package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rxfnvtiwwu")
public class RxfnvtiwwuController {

    private final RxfnvtiwwuService rxfnvtiwwuService;

    public RxfnvtiwwuController(RxfnvtiwwuService rxfnvtiwwuService) {
        this.rxfnvtiwwuService = rxfnvtiwwuService;
    }

    @Get("/")
    public String index() {
        return rxfnvtiwwuService.getGreeting();
    }
}
