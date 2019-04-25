package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TrgrpbnmsoController {

    private final TrgrpbnmsoService trgrpbnmsoService;

    public TrgrpbnmsoController(TrgrpbnmsoService trgrpbnmsoService) {
        this.trgrpbnmsoService = trgrpbnmsoService;
    }

    @RequestMapping("/trgrpbnmso")
    public String index() {
        return trgrpbnmsoService.getGreeting();
    }

}
