package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpxdlpghofController {

    private final SpxdlpghofService spxdlpghofService;

    public SpxdlpghofController(SpxdlpghofService spxdlpghofService) {
        this.spxdlpghofService = spxdlpghofService;
    }

    @RequestMapping("/spxdlpghof")
    public String index() {
        return spxdlpghofService.getGreeting();
    }

}
