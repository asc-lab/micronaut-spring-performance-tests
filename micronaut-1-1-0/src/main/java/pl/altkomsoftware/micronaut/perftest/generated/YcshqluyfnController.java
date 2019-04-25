package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ycshqluyfn")
public class YcshqluyfnController {

    private final YcshqluyfnService ycshqluyfnService;

    public YcshqluyfnController(YcshqluyfnService ycshqluyfnService) {
        this.ycshqluyfnService = ycshqluyfnService;
    }

    @Get("/")
    public String index() {
        return ycshqluyfnService.getGreeting();
    }
}
