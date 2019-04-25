package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mbbqmfxhcj")
public class MbbqmfxhcjController {

    private final MbbqmfxhcjService mbbqmfxhcjService;

    public MbbqmfxhcjController(MbbqmfxhcjService mbbqmfxhcjService) {
        this.mbbqmfxhcjService = mbbqmfxhcjService;
    }

    @Get("/")
    public String index() {
        return mbbqmfxhcjService.getGreeting();
    }
}
