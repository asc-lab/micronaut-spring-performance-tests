package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wsqokevlsj")
public class WsqokevlsjController {

    private final WsqokevlsjService wsqokevlsjService;

    public WsqokevlsjController(WsqokevlsjService wsqokevlsjService) {
        this.wsqokevlsjService = wsqokevlsjService;
    }

    @Get("/")
    public String index() {
        return wsqokevlsjService.getGreeting();
    }
}
