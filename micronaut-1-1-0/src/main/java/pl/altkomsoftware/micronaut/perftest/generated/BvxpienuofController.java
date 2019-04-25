package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bvxpienuof")
public class BvxpienuofController {

    private final BvxpienuofService bvxpienuofService;

    public BvxpienuofController(BvxpienuofService bvxpienuofService) {
        this.bvxpienuofService = bvxpienuofService;
    }

    @Get("/")
    public String index() {
        return bvxpienuofService.getGreeting();
    }
}
