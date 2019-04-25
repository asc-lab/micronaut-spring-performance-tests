package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mdxzzznwwh")
public class MdxzzznwwhController {

    private final MdxzzznwwhService mdxzzznwwhService;

    public MdxzzznwwhController(MdxzzznwwhService mdxzzznwwhService) {
        this.mdxzzznwwhService = mdxzzznwwhService;
    }

    @Get("/")
    public String index() {
        return mdxzzznwwhService.getGreeting();
    }
}
