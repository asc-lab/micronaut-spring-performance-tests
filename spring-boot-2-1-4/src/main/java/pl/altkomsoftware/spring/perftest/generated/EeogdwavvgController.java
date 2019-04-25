package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EeogdwavvgController {

    private final EeogdwavvgService eeogdwavvgService;

    public EeogdwavvgController(EeogdwavvgService eeogdwavvgService) {
        this.eeogdwavvgService = eeogdwavvgService;
    }

    @RequestMapping("/eeogdwavvg")
    public String index() {
        return eeogdwavvgService.getGreeting();
    }

}
