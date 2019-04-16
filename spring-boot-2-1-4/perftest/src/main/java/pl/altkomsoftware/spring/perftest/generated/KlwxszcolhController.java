package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KlwxszcolhController {

    private final KlwxszcolhService klwxszcolhService;

    public KlwxszcolhController(KlwxszcolhService klwxszcolhService) {
        this.klwxszcolhService = klwxszcolhService;
    }

    @RequestMapping("/klwxszcolh")
    public String index() {
        return klwxszcolhService.getGreeting();
    }

}
