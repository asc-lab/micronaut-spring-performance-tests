package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CelykyjvweController {

    private final CelykyjvweService celykyjvweService;

    public CelykyjvweController(CelykyjvweService celykyjvweService) {
        this.celykyjvweService = celykyjvweService;
    }

    @RequestMapping("/celykyjvwe")
    public String index() {
        return celykyjvweService.getGreeting();
    }

}
