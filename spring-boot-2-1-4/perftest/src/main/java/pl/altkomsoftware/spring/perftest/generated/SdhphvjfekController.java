package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SdhphvjfekController {

    private final SdhphvjfekService sdhphvjfekService;

    public SdhphvjfekController(SdhphvjfekService sdhphvjfekService) {
        this.sdhphvjfekService = sdhphvjfekService;
    }

    @RequestMapping("/sdhphvjfek")
    public String index() {
        return sdhphvjfekService.getGreeting();
    }

}
