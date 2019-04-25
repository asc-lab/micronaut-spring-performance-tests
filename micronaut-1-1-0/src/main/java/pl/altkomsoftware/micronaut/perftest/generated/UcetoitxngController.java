package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ucetoitxng")
public class UcetoitxngController {

    private final UcetoitxngService ucetoitxngService;

    public UcetoitxngController(UcetoitxngService ucetoitxngService) {
        this.ucetoitxngService = ucetoitxngService;
    }

    @Get("/")
    public String index() {
        return ucetoitxngService.getGreeting();
    }
}
