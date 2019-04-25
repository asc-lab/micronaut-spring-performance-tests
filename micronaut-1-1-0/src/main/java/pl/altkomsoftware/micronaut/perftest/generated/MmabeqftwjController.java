package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mmabeqftwj")
public class MmabeqftwjController {

    private final MmabeqftwjService mmabeqftwjService;

    public MmabeqftwjController(MmabeqftwjService mmabeqftwjService) {
        this.mmabeqftwjService = mmabeqftwjService;
    }

    @Get("/")
    public String index() {
        return mmabeqftwjService.getGreeting();
    }
}
