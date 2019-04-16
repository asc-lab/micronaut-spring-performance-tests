package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ipsyuglclh")
public class IpsyuglclhController {

    private final IpsyuglclhService ipsyuglclhService;

    public IpsyuglclhController(IpsyuglclhService ipsyuglclhService) {
        this.ipsyuglclhService = ipsyuglclhService;
    }

    @Get("/")
    public String index() {
        return ipsyuglclhService.getGreeting();
    }
}
