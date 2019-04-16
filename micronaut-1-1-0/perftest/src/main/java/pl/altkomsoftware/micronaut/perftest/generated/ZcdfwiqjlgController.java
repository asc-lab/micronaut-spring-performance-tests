package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zcdfwiqjlg")
public class ZcdfwiqjlgController {

    private final ZcdfwiqjlgService zcdfwiqjlgService;

    public ZcdfwiqjlgController(ZcdfwiqjlgService zcdfwiqjlgService) {
        this.zcdfwiqjlgService = zcdfwiqjlgService;
    }

    @Get("/")
    public String index() {
        return zcdfwiqjlgService.getGreeting();
    }
}
