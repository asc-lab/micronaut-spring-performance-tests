package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UtmgaewjxjController {

    private final UtmgaewjxjService utmgaewjxjService;

    public UtmgaewjxjController(UtmgaewjxjService utmgaewjxjService) {
        this.utmgaewjxjService = utmgaewjxjService;
    }

    @RequestMapping("/utmgaewjxj")
    public String index() {
        return utmgaewjxjService.getGreeting();
    }

}
