package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pmvdcsdgnh")
public class PmvdcsdgnhController {

    private final PmvdcsdgnhService pmvdcsdgnhService;

    public PmvdcsdgnhController(PmvdcsdgnhService pmvdcsdgnhService) {
        this.pmvdcsdgnhService = pmvdcsdgnhService;
    }

    @Get("/")
    public String index() {
        return pmvdcsdgnhService.getGreeting();
    }
}
